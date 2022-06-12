package com.purnaprasanth.buildsrc

/**
 * Created by viking_93 on 24/12/2019
 **/

object TestLibs {

    object Junit {
        const val jUnit = "org.junit:junit-bom:${Versions.jUnit}"
        const val jupiter = "org.junit.jupiter:junit-jupiter:${Versions.jUnit}"
        const val atslJunit = "androidx.test.ext:junit:${Versions.atslExt}"
    }

    object KoTest {
        const val framework = "io.kotest:kotest-runner-junit5:${Versions.kotest}"
        const val assertions = "io.kotest:kotest-assertions-core:${Versions.kotest}"
        const val propertyTesting = "io.kotest:kotest-property:${Versions.kotest}"
    }

    object CoRoutines {
        const val kotlinx =
            "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coRoutineTest}"
    }

    object Kotlin {
        const val kotlinJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    }

    object Mockk {
        const val mockk = "io.mockk:mockk:${Versions.mockk}"
    }

    object AndroidX {
        const val junitExt = "androidx.test.ext:junit:${Versions.junitExt}"
        const val esspressCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    }

    object Espresso {
        const val core = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    }
}