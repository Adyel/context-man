package io.github.adyel.contextman

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ContextUpdaterApplication

fun main(args: Array<String>) {
    runApplication<ContextUpdaterApplication>(*args)
}
