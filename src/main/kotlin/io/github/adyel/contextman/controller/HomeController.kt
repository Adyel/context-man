package io.github.adyel.contextman.controller

import io.github.adyel.contextman.dto.*
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

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
}
