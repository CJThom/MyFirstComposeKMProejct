pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }

//    plugins {
//        kotlin("multiplatform").version(extra["kotlin.version"] as String)
//        kotlin("android").version(extra["kotlin.version"] as String)
//
//        id("com.android.application").version(extra["agp.version"] as String)
//        id("com.android.library").version(extra["agp.version"] as String)
//        id("org.jetbrains.compose").version(extra["compose.version"] as String)
//
//        id("app.cash.sqldelight").version("2.0.0-alpha05")
//
////        kotlin("kapt")
////        id("dagger.hilt.android.plugin").version("2.45")
//
//    }

//    sqldelight {
//        databases {
//            create("Database") {
//                packageName.set("com.example")
//            }
//        }
//    }
}



rootProject.name = "MyFirstKMMDesktopApp"

include(":android")
include(":desktop")
include(":common")
include(":data")
