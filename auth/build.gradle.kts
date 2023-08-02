import com.purnaprasanth.buildsrc.Libs

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("kotlin")
}

apply(from = Libs.dependency)

tasks.compileTestKotlin {
    kotlinOptions {
        freeCompilerArgs = freeCompilerArgs.toMutableList().apply {
            addAll(
                listOf(
                    "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
                    "-opt-in=kotlin.RequiresOptIn"
                )
            )
        }
    }
}

tasks.test {
    useJUnitPlatform()
}
