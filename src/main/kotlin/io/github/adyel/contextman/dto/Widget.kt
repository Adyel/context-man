package io.github.adyel.contextman.dto

import kotlinx.serialization.Serializable

/**
 * @author adyel
 * @since 5/7/22
 */

@Serializable
data class Widget(
    var textParagraph: TextParagraph? = null,
    var keyValue: KeyValue? = null
)
