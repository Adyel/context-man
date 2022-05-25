package io.github.adyel.contextman.dto

import kotlinx.serialization.Serializable

/**
 * @author adyel
 * @since 5/7/22
 */

@JvmRecord
@Serializable
data class Header(
    val title: String,
    val subtitle: String,
    val imageUrl: String,
    val imageStyle: ImageStyle
)
