package io.github.adyel.contextman.dto

import kotlinx.serialization.Serializable

/**
 * @author adyel
 * @since 5/7/22
 */

@JvmRecord
@Serializable
data class Card(
    val header: Header,
    val sections: List<Section>
)
