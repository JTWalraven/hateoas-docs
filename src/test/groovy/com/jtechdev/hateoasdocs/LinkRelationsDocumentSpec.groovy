package com.jtechdev.hateoasdocs

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.module.kotlin.KotlinModule
import spock.lang.Specification

class LinkRelationsDocumentSpec extends Specification {

    def 'Converts demo01 yaml using object mapper'() {
        given: 'An object mapper'
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory()).registerModule(new KotlinModule())

        when: 'Reading demo01 yaml file'
        LinkRelationsDocument document = objectMapper.readValue(new File("src/test/resources/relation-docs/demo01.yml"), LinkRelationsDocument)

        then: 'The expected metadata matches'
        document.title == 'Demo01 Link Relation Types'
        document.description == 'Just some demo link relation types.'
        document.reference == 'http://somewebsite.com/demo01'
        document.formats == ['text', 'html', 'csv', 'java']

        and: 'A fully described link relation matches'
        with (document.linkRelations.find { it.name == 'custom-link' }) {
            description == 'Refers to a resource that is the subject of the link\'s context.'
            reference == '[RFC1149]'
            notes == 'Used to link to custom pages.'
        }

        and: 'A minimally described link relation matches'
        with (document.linkRelations.find { it.name == 'other-custom-link'}) {
            !description
            !reference
            !notes
        }
    }
    
}
