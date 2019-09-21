package com.jtechdev.hateoasdocs

import com.google.auto.service.AutoService
import javax.annotation.processing.*
import javax.lang.model.SourceVersion
import javax.lang.model.element.TypeElement

/**
 * Annotation processor for documenting link relations.
 *
 * Looks for link relation annotations and generates
 * documentation.
 *
 * @author Jeffrey Walraven
 * @since 0.1
 */
@SupportedAnnotationTypes(
    "" // TODO: Request Mapping / GET / POST / Etc.
)
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor::class)
class LinkRelProcessor : AbstractProcessor() {

    override fun process(annotations: Set<TypeElement>, roundEnv: RoundEnvironment): Boolean {
        return false;
    }
}
