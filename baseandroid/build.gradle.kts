import com.purnaprasanth.buildsrc.Libs

plugins {
    id("com.android.library")
    id("kotlin-android")
}

apply(from = Libs.dependency)

android {
    compileSdk = libs.versions.compileSdk.get().toInt()
    namespace = "com.purnaprasanth.twitches.baseandroid"

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.current()
        targetCompatibility = JavaVersion.current()
    }

    kotlinOptions {
        jvmTarget = JavaVersion.current().toString()
    }
}