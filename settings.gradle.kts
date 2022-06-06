pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven(url = "https://oss.jfrog.org/artifactory/libs-release")
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://oss.jfrog.org/artifactory/libs-release")
        maven(url = "https://oss.jfrog.org/libs-snapshot")
    }
}

rootProject.name = "MapWitches"

include(":app")
include(":base")
include(":baseandroid")
include(":auth")
include(":twitchauthandroid")
