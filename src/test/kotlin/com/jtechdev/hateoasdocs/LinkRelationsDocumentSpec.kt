package com.jtechdev.hateoasdocs

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import java.io.File

object LinkRelationsDocumentSpec : Spek({

    describe("A LinkRelationsDocument to yaml conversion using an ObjectMapper") {
        val objectMapper = ObjectMapper(YAMLFactory()).registerModule(KotlinModule())
        describe("Reading demo01 yaml file") {
            val document = objectMapper.readValue(
                File("src/test/resources/relation-docs/demo01.yml"),
                LinkRelationsDocument::class.java
            )
            it("Matches expected metadata") {
                with(document) {
                    assertEquals()
                }
            }
        }
    }
})