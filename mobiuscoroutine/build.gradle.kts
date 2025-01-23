import com.purnaprasanth.buildsrc.Libs

plugins {
    id("kotlin")
}

apply(from = Libs.dependency)

tasks.compileKotlin {
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