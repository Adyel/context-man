package io.github.adyel.contextman.dto

import kotlinx.serialization.Serializable

/**
 * @author adyel
 * @since 5/7/22
 */

@Serializable
data class Section(
    val widgets: List<Widget>
)
