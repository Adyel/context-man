package io.github.adyel.contextman.dto

import kotlinx.serialization.Serializable

/**
 * @author adyel
 * @since 5/7/22
 */
//@JsonClass(generateAdapter = true)
@JvmRecord
@Serializable
data class Message(
    val cards: List<Card>
)
