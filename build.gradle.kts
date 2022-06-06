plugins {
    id("com.android.application").version("7.1.2").apply(false)
    id("org.jetbrains.kotlin.jvm").version("1.6.21")
    id("io.gitlab.arturbosch.detekt").version("1.19.0")
    id("com.github.ben-manes.versions").version("0.42.0")
    id("com.google.dagger.hilt.android").version("2.42").apply(false)
    id("com.android.library").version("7.1.2").apply(false)
    id("org.jetbrains.kotlin.android").version("1.6.21").apply(false)
}

subprojects {
    apply(plugin = "io.gitlab.arturbosch.detekt")
    apply(plugin = "com.github.ben-manes.versions")
    detekt {
        config = files("${project.rootDir}/config/detekt/detekt.yml")
        parallel = true
    }
    /*tasks.named(
        "dependencyUpdates",
        com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask::class.java
    ).configure {
        rejectVersionIf {
            val version = this.candidate.version
            val stableKeyword = arrayOf("RELEASE", "FINAL", "GA").any { stableTag ->
                version.toUpperCase().contains(stableTag)
            }
            val regex = Regex("/^[0-9,.v-]+(-r)?$/")
            !stableKeyword && !(version.matches(regex))
        }
    }*/
}
