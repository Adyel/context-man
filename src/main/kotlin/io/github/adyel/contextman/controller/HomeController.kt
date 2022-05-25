package io.github.adyel.contextman.controller

import io.github.adyel.contextman.dto.*
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.eclipse.jgit.api.Git
import org.eclipse.jgit.api.MergeCommand
import org.eclipse.jgit.merge.MergeStrategy
import org.springframework.scheduling.annotation.Async
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import java.nio.file.Files

/**
 * @author adyel
 * @since 5/7/22
 */

@RestController
class HomeController {

    @GetMapping("/")
    @ResponseBody
    fun home(): String {

        val message = Message(
            listOf(
                Card(
                    Header(
                        "Header Title",
                        "Header Subtitle",
                        "Image Url",
                        ImageStyle.IMAGE
                    ),
                    listOf(
                        Section(
                            listOf(
                                Widget(
                                    keyValue = KeyValue(
                                        "Top Label",
                                        "Some Content",
                                        false,
                                        "Bottom Label"
                                    )
                                ),
                                Widget(
                                    textParagraph = TextParagraph("Some Text are never ok")
                                )
                            )
                        )
                    )
                )
            )
        )

        return Json.encodeToString(message)
    }

    @Async
    @GetMapping("/git-clone")
    fun procGitClone() {
        val git = Git.cloneRepository()
            .setURI("https://github.com/Adyel/ServerSam")
            .setDirectory(Files.createTempDirectory("git-clone-test").toFile())
//            .setBranchesToClone(listOf("refs/heads/master", "refs/heads/feature_division", "refs/heads/feature_division_polished"))
            .setBranch("refs/heads/maintenance/dep-update")
            .call();

        val repository = git.repository

        val featureDivision = repository.resolve("refs/remotes/origin/dependabot/gradle/maintenance/dep-update/org.jsoup-jsoup-1.14.1")
        val featureDivisionPolished = repository.resolve("refs/remotes/origin/dependabot/gradle/maintenance/dep-update/org.jsoup-jsoup-1.14.1")

        git.branchList().call().forEach {
            println(it.name)
        }

        git.merge()
            .include(featureDivision)
            .call()


        git.merge()
            .include(featureDivisionPolished)
            .call()

    }
}
