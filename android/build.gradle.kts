plugins {
    //id("org.jetbrains.compose")
//    id("com.android.application")
//    kotlin("android")
//    kotlin("kapt")
//
//    id("app.cash.sqldelight")
//
//   // id("kotlin-kapt")
//    id("dagger.hilt.android.plugin")
////    id("dagger.hilt.android.plugin")
    id("com.android.application")
    kotlin("android")
//    id("kotlin-kapt")
//    id("dagger.hilt.android.plugin")
    id("org.jetbrains.compose") version "1.3.1"
//    id("com.google.devtools.ksp") version "1.8.0-1.0.9"
}


android {
    compileSdk = 33
    defaultConfig {
        applicationId = "com.example.android"
        minSdk = 25

        versionCode = 1
        versionName = "1.0-SNAPSHOT"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
//
//    kapt {
//        correctErrorTypes = true
//    }
////
//    hilt {
//        enableAggregatingTask = true
//    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

//    sourceSets {
//        main.java.srcDirs += 'src/main/kotlin'
//        test.java.srcDirs += 'src/test/kotlin'
//    }


//    applicationVariants.all {
//        val variantName = name
//        sourceSets {
//            getByName("main") {
//                java.srcDir(File("build/generated/ksp/$variantName/kotlin"))
//            }
//        }
//    }

    namespace = "com.example.android"
}

//group = "com.example"
//version = "1.0-SNAPSHOT"

repositories {
    //   jcenter()
    google()
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation(project(":common"))
    implementation("androidx.activity:activity-compose:1.6.1")
    implementation("app.cash.sqldelight:android-driver:2.0.0-alpha05")

//    implementation("com.google.dagger:hilt-android:2.45")
//    kapt("com.google.dagger:hilt-android-compiler:2.45")

    implementation("io.insert-koin:koin-core:3.3.3")
    implementation("io.insert-koin:koin-android:3.3.3")
    implementation("io.insert-koin:koin-androidx-compose:3.4.2")

  //  implementation("io.insert-koin:koin-annotations:1.1.1")
   // ksp("io.insert-koin:koin-ksp-compiler:1.1.1")

//    kapt("com.google.dagger:hilt-android-compiler:2.42")
//    kapt("androidx.hilt:hilt-compiler:1.0.0")


//    implementation("androidx.compose.runtime:runtime:1.3.3")
//    implementation("androidx.compose.foundation:foundation:1.3.1")
//    implementation("androidx.compose.material:material:1.3.1")
//    implementation("androidx.compose.ui:ui:1.3.3")

    //implementation("org.jetbrains.compose.ui:ui-tooling-preview"
    //api(compose.preview)

    // api(compose.uiTooling)
//    api(compose.runtime)
//    api(compose.foundation)
//    api(compose.material)
//    api(compose.preview)
//    api(compose.ui)
//    api(compose.uiTooling)
}


//sqldelight {
//    databases {
//        create("Database") {
//            packageName.set("com.example")
//        }
//    }
//}