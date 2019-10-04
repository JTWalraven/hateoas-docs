package com.jtechdev.hateoasdocs.converter

import com.jtechdev.hateoasdocs.LinkRelationsDocument
import java.io.Writer

/**
 * Interface for converting [LinkRelationsDocument].
 *
 * @author Jeffrey Walraven
 * @see LinkRelationsDocument
 * @since 0.1
 */
interface LinkRelationsDocumentConverter {

    /**
     * Convert the link relations document to the output.
     *
     * @param document The [LinkRelationsDocument] to convert
     * @param output The [Writer] to use to output the converted document
     */
    fun convert(document: LinkRelationsDocument, output: Writer)
}
