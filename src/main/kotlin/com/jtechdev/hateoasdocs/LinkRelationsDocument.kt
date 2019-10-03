package com.jtechdev.hateoasdocs

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * A document containing link relation descriptions.
 *
 * @author Jeffrey Walraven
 * @see LinkRelation
 * @since 0.1
 */
data class LinkRelationsDocument(
    val title: String = "Link Relations",
    val description: String?,
    val reference: String?,
    val formats: List<String> = ArrayList(),
    @JsonProperty("link-relations") val linkRelations: List<LinkRelation> = ArrayList()
)
