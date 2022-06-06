package com.purnaprasanth.buildsrc

import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.addUnitTest(testImplementation: Boolean = true) {
    val configName = if (testImplementation) "testImplementation" else "implementation"

    add(configName, enforcedPlatform(TestLibs.Junit.jUnit))
    add(configName, TestLibs.Junit.jupiter)
    add(configName, TestLibs.Mockk.mockk)
    add(configName, TestLibs.Kotlin.kotlinJunit)
    add(configName, TestLibs.CoRoutines.kotlinx)
}