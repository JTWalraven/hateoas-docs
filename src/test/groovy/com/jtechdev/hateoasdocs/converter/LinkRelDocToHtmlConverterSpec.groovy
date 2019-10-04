package com.jtechdev.hateoasdocs.converter

import com.jtechdev.hateoasdocs.LinkRelation
import com.jtechdev.hateoasdocs.LinkRelationsDocument
import freemarker.template.Configuration
import spock.lang.Shared
import spock.lang.Specification

class LinkRelDocToHtmlConverterSpec extends Specification {

    @Shared
    Configuration config = new Configuration(Configuration.VERSION_2_3_29)

    void setupSpec() {
        config.setDirectoryForTemplateLoading(new File('src/test/resources/relation-docs/'))
    }


    void 'Converts link relations document to valid html'() {
        given: 'A link rel doc to html converter'
        LinkRelationsDocumentConverter converter = new LinkRelDocToHtmlConverter(config)

        and: 'A link relations document'
        LinkRelationsDocument document = new LinkRelationsDocument()
        document.title = 'Some Title'
        document.description = 'Some description'
        document.reference = 'Some reference'
        document.formats = ['text', 'html']
        document.linkRelations = [
                new LinkRelation('test', 'some description')
        ]

        and: 'An output writer'
        Writer output = new OutputStreamWriter(System.out)

        when: 'Converting the document'

    }
}
