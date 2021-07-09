package com.purnaprasanth.buildsrc

/**
 * Created by viking_93 on 2019-11-07
 **/

object Libs {

    object Plugins {
        const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.pluginGradle}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    }

    object Androidx {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val constraintLayout =
            "com.android.support.constraint:constraint-layout:${Versions.constraintLayout}"
        const val ktx = "androidx.core:core-ktx:${Versions.ktx}"
        const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recycleView}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val motionLayout = "androidx.constraintlayout:constraintlayout:${Versions.motionLayout}"
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

    object Room {
        const val runtime = "androidx.room:room-runtime:${Versions.room}"
        const val compiler = "androidx.room:room-compiler:${Versions.room}"
        const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
        const val roomRxJava = "androidx.room:room-rxjava2:${Versions.room}"
    }

    object Kotlin {
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
        const val coRoutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coRoutines}"
        const val coRoutineAndroid =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coRoutines}"
    }

    object FlowBindings {
        const val platformBindings = "io.github.reactivecircus.flowbinding:flowbinding-android:${Versions.flow_binding_version}"
        const val material = "io.github.reactivecircus.flowbinding:flowbinding-material:${Versions.flow_binding_version}"
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

    object Dagger {
        const val core = "com.google.dagger:dagger:${Versions.dagger2}"
        const val android = "com.google.dagger:dagger-android:${Versions.dagger2}"
        const val androidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger2}"
        const val compiler = "com.google.dagger:dagger-compiler:${Versions.dagger2}"
        const val androidSupportCompiler =
            "com.google.dagger:dagger-android-processor:${Versions.dagger2}"
    }

    object Coil {
        const val coil = "io.coil-kt:coil:${Versions.coil}"
    }
}