package com.jtechdev.hateoasdocs

/**
 * Contains the information describing a link relation.
 *
 * @author Jeffrey Walraven
 * @see LinkRelationsDocument
 * @since 0.1
 */
data class LinkRelation(
    val name: String,
    val description: String,
    val reference: String,
    val notes: String
)
