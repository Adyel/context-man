package io.github.adyel.contextman.dto

import kotlinx.serialization.Serializable

/**
 * @author adyel
 * @since 5/7/22
 */

@JvmRecord
@Serializable
data class TextParagraph(
    val text: String
)
