package io.github.adyel.contextman.dto

/**
 * @author adyel
 * @since 5/7/22
 */
//@JsonClass(generateAdapter = true)
@kotlinx.serialization.Serializable
data class Message(
    val cards: List<Card>
)
