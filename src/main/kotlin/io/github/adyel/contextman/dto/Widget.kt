package io.github.adyel.contextman.dto

import kotlinx.serialization.Serializable

/**
 * @author adyel
 * @since 5/7/22
 */

@JvmRecord
@Serializable
data class Widget(
    val textParagraph: TextParagraph? = null,
    val keyValue: KeyValue? = null
)
