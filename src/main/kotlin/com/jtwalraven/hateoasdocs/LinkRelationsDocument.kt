package com.jtwalraven.hateoasdocs

/**
 * A document containing link relation descriptions.
 *
 * @author Jeffrey Walraven
 * @see LinkRelation
 * @since 0.1
 */
data class LinkRelationsDocument(
    val title: String,
    val description: String,
    val reference: String,
    val formats: List<String>,
    val linkRelations: List<LinkRelation>
)
