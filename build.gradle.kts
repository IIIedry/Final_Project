//// Top-level build file where you can add configuration options common to all sub-projects/modules.
//buildscript {
//    dependencies {
//        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.40.1")
//        classpath ("com.google.gms:google-services:4.3.13")
//
//        def nav_version
//
//        = "2.5.0"
//        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
//    }
//}

buildscript {
    repositories {
        google()
    }
    dependencies {
        var nav_version = "2.7.6"
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
    }
}

plugins {
    id("com.android.application") version "8.1.2" apply false
    id("com.android.library") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false

}