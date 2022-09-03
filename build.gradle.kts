import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

plugins {
    id("com.android.application") version "7.1.2" apply false
    id("org.jetbrains.kotlin.jvm") version "1.6.21" apply false
    id("io.gitlab.arturbosch.detekt") version "1.21.0"
    id("com.github.ben-manes.versions") version "0.42.0"
    id("com.google.dagger.hilt.android") version "2.43.2" apply false
    id("com.android.library") version "7.1.2" apply false
    id("org.jetbrains.kotlin.android") version ("1.6.21") apply false
}

subprojects {
    apply(plugin = "io.gitlab.arturbosch.detekt")
    apply(plugin = "com.github.ben-manes.versions")
    detekt {
        config = files("${project.rootDir}/config/detekt/detekt.yml")
        parallel = true
    }
}

allprojects {
    tasks.withType<DependencyUpdatesTask> {
        rejectVersionIf {
            isNonStable(candidate.version)
        }
    }
}

fun isNonStable(version: String): Boolean {
    logger.log(LogLevel.INFO, "updates plugin: $version")
    val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { version.toUpperCase().contains(it) }
    val regex = "^[0-9,.v-]+(-r)?$".toRegex()
    val isStable = stableKeyword || regex.matches(version)
    return isStable.not()
}
