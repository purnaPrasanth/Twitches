import com.purnaprasanth.buildsrc.Libs

plugins {
    id("kotlin")
    id("kotlin-kapt")
}

apply(from = Libs.dependency)

tasks.compileKotlin {
    kotlinOptions {
        jvmTarget = "1.8"
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