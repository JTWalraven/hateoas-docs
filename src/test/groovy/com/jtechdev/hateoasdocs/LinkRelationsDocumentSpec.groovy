package com.jtechdev.hateoasdocs

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.module.kotlin.KotlinModule
import spock.lang.Specification

class LinkRelationsDocumentSpec extends Specification {

    def 'Converts iana yaml using object mapper'() {
        given: 'An object mapper'
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory()).registerModule(new KotlinModule())

        when: 'Reading iana yaml file'
        LinkRelationsDocument document = objectMapper.readValue(new File("src/test/resources/relation-docs/iana.yml"), LinkRelationsDocument)

        then: 'The expected metadata matches'
        document.title == 'IANA Link Relation Types'
        document.description == 'The standard IANA link relations.'
        document.reference == 'https://www.iana.org/assignments/link-relations/link-relations.xhtml'
        document.formats == ['text', 'html', 'csv']

        and: 'A fully described link relation matches'
        with (document.linkRelations.find { it.name == 'about' }) {
            description == 'Refers to a resource that is the subject of the link\'s context.'
            reference == '[RFC6903], section 2'
            notes == 'Used to link about pages.'
        }

        and: 'A minimally described link relation matches'
        with (document.linkRelations.find { it.name == 'working-copy-of'}) {
            !description
            !reference
            !notes
        }
    }
    
}
