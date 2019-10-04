package com.jtechdev.hateoasdocs.converter

import com.jtechdev.hateoasdocs.LinkRelationsDocument
import java.io.Writer
import freemarker.template.Configuration

class LinkRelDocToHtmlConverter(private val config: Configuration) : LinkRelationsDocumentConverter {

    override fun convert(document: LinkRelationsDocument, output: Writer) {
        val template = config.getTemplate("link-relations-webpage.ftlh")
        template.process(document, output)
    }
}
