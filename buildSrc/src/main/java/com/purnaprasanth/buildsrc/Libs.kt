package com.purnaprasanth.buildsrc

/**
 * Created by viking_93 on 2019-11-07
 **/

object Libs {

    private const val path = "../commonGradleFiles/"
    const val common = "${path}commonDependencies.gradle"
    const val commonAndroid = "${path}commonAndroidDependencies.gradle"

    const val dependency = "./gradleScripts/dependencies.gradle"

    object Plugins {
        const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.pluginGradle}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31"
        const val versionChecker =
            "com.github.ben-manes:gradle-versions-plugin:${Versions.versionChecker}"
    }

    object Androidx {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val constraintLayout =
            "com.android.support.constraint:constraint-layout:${Versions.constraintLayout}"
        const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recycleView}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val motionLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    }

    object PlayServices {
        const val maps = "com.google.android.gms:play-services-maps:${Versions.playServices}"
    }

    object LifeCycle {
        const val extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
        const val runner = "androidx.lifecycle:lifecycle-runtime:${Versions.lifecycle}"
        const val compiler = "androidx.lifecycle:lifecycle-runtime:${Versions.lifecycle}"
    }

    object Navigation {
        const val fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val ui = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    }

    object Mobius {
        const val core = "com.spotify.mobius:mobius-core:${Versions.mobius}"
        const val test = "com.spotify.mobius:mobius-test:${Versions.mobius}"
    }

    object Room {
        const val runtime = "androidx.room:room-runtime:${Versions.room}"
        const val compiler = "androidx.room:room-compiler:${Versions.room}"
        const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
        const val roomRxJava = "androidx.room:room-rxjava2:${Versions.room}"
    }

    object DataStore {
        const val dataStore = "androidx.datastore:datastore:${Versions.dataStore}"
        const val core = "androidx.datastore:datastore-core:${Versions.dataStore}"
    }

    object Kotlin {
        const val coRoutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coRoutines}"
        const val coRoutineAndroid =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coRoutines}"
    }

    object FlowBindings {
        const val platformBindings =
            "io.github.reactivecircus.flowbinding:flowbinding-android:${Versions.flow_binding_version}"
        const val material =
            "io.github.reactivecircus.flowbinding:flowbinding-material:${Versions.flow_binding_version}"
    }

    object OkHttp {
        const val core = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
        const val mockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.okHttp}"
    }

    object Epoxy {
        const val core = "com.airbnb.android:epoxy:${Versions.epoxy}"
        const val epoxyAnnotations = "com.airbnb.android:epoxy-processor:${Versions.epoxy}"
    }

    object Browser {
        const val browser = "androidx.browser:browser:${Versions.browser}"
    }

    object Retrofit {
        const val core = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val mock = "com.squareup.retrofit2:retrofit-mock:${Versions.retrofit}"
        const val rxJavaAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    }

    object Stetho {
        const val core = "com.facebook.stetho:stetho:${Versions.stetho}"
        const val okhttp = "com.facebook.stetho:stetho-okhttp3:${Versions.stetho}"
    }

    object Hilt {
        const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltAnnotation = "com.google.dagger:hilt-compiler:${Versions.hilt}"
    }

    object Coil {
        const val coil = "io.coil-kt:coil:${Versions.coil}"
    }

    object Auth {
        const val appAuth = "net.openid:appauth:${Versions.appAuth}"
    }

    object Arrow {
        const val core = "io.arrow-kt:arrow-core:${Versions.arrow}"
        const val fx = "io.arrow-kt:arrow-fx-coroutines:${Versions.arrow}"
        const val optics = "io.arrow-kt:arrow-optics:${Versions.arrow}"
        const val meta = "io.arrow-kt:arrow-meta:${Versions.arrow}"
    }
}