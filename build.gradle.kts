

buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0")
      //  classpath("com.android.tools.build:gradle:7.4.2")
        classpath("com.android.tools.build:gradle:7.4.2")
        classpath("app.cash.sqldelight:gradle-plugin:2.0.0-alpha05")
       // classpath("com.google.dagger:hilt-android-gradle-plugin:2.45")

    //    classpath("org.jetbrains.compose:compose-gradle-plugin:1.4.0-alpha01-dev977")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}


//group = "com.example"
//version = "1.0-SNAPSHOT"
//
//allprojects {
//    repositories {
//        google()
//        mavenCentral()
//        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
//    }
//
//}
//
//plugins {
//    kotlin("multiplatform") apply false
//    kotlin("android") apply false
//    id("com.android.application") apply false
//    id("com.android.library") apply false
//    id("org.jetbrains.compose") apply false
//    id("app.cash.sqldelight") apply false
////    id("com.google.dagger.hilt") apply false
//
//    //id("com.google.dagger:hilt-android-gradle-plugin:2.45")
////    id("com.google.dagger") apply false
//
//
//
//}
//
