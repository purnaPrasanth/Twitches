import com.android.build.gradle.internal.plugins.VersionCheckPlugin
import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask
import io.gitlab.arturbosch.detekt.DetektPlugin

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.application).apply(false)
    alias(libs.plugins.android.library).apply(false)
    alias(libs.plugins.kotlin.android).apply(false)
    alias(libs.plugins.kotlin.jvm).apply(false)
    alias(libs.plugins.hiltAndroid).apply(false)
    alias(libs.plugins.detekt)
    alias(libs.plugins.versionChecker)
}

subprojects {
    apply<DetektPlugin>()
    apply<VersionCheckPlugin>()
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
    val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { version.uppercase().contains(it) }
    val regex = "^[0-9,.v-]+(-r)?$".toRegex()
    val isStable = stableKeyword || regex.matches(version)
    return isStable.not()
}
