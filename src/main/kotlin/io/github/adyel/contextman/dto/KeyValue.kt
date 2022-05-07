package io.github.adyel.contextman.dto

import kotlinx.serialization.Serializable

/**
 * @author adyel
 * @since 5/7/22
 */

@Serializable
data class KeyValue(
    var topLabel: String,
    var content: String,
    var contentMultiline: Boolean,
    var bottomLabel: String,
)
