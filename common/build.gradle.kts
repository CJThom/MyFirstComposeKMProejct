plugins {
    kotlin("multiplatform")
//    id("com.google.devtools.ksp") version "1.8.0-1.0.9"
    id("com.android.library")
    id("app.cash.sqldelight")
    id("org.jetbrains.compose") version "1.3.1"

//    id("kotlin-kapt")
//    id("dagger.hilt.android.plugin")
}

group = "com.example"
version = "1.0-SNAPSHOT"





kotlin {

    android()
    jvm("desktop") {
        jvmToolchain(11)
    }
    sourceSets {
        val commonMain by getting {
           // kotlin.srcDir(File("build/generated/ksp/commonMain/kotlin"))
          //  kotlin.srcDir("build/generated/ksp/desktop/desktopMain/kotlin")
           // kotlin.srcDir("build/generated/ksp/metadata/commonMain/kotlin")
           // kotlin.srcDir("build/generated/ksp/commonMain/kotlin")
//            getByName("commonMain") {
//                kotlin.srcDir(File("build/generated/ksp/kotlin"))
//            }

            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.4.0")

                implementation("io.insert-koin:koin-core:3.3.3")
                //implementation("io.insert-koin:koin-annotations:1.1.1")
                // implementation("io.insert-koin:koin-ksp-compiler:1.1.1")


                //api(compose.runtime)
                api(compose.foundation)
                api(compose.material)
                api(compose.preview)
                api(compose.ui)
                //   implementation("androidx.compose.ui:ui:1.3.3")
                api(compose.uiTooling)
            }
        }
//        val commonTest by getting {
//            dependencies {
//                implementation(kotlin("test"))
//            }
//        }
        val androidMain by getting {
            dependencies {
                //dependsOn(commonMain)
               // kotlin.srcDir(File("build/generated/ksp/androidMain/kotlin"))
                api("androidx.appcompat:appcompat:1.6.1")
                api("androidx.core:core-ktx:1.9.0")
                implementation("app.cash.sqldelight:android-driver:2.0.0-alpha05")

               // implementation("io.insert-koin:koin-core:3.3.3")
                implementation("io.insert-koin:koin-android:3.3.3")

                implementation("io.insert-koin:koin-core:3.3.3")
            //    implementation("io.insert-koin:koin-annotations:1.1.1")
             //   implementation("io.insert-koin:koin-annotations:1.1.1")
                //   implementation("io.insert-koin:koin-ksp-compiler:1.1.1")

                implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.0")

                //  implementation("com.google.dagger:hilt-android:2.45")

//                configurations.getByName("kapt").dependencies.add(
//                    org.gradle.api.internal.artifacts.dependencies.DefaultExternalModuleDependency(
//                        "com.google.dagger",
//                        "hilt-compiler",
//                        "2.45"
//                    )
//                )

//                configurations["kapt"].dependencies.add(
//                    org.gradle.api.internal.artifacts.dependencies.DefaultExternalModuleDependency(
//                        "com.google.dagger",
//                        "hilt-compiler",
//                        "2.45"
//                    )
//                )
                //  kapt("com.google.dagger:hilt-android-compiler:2.45")

            }
        }
//        val androidTest by getting {
//            dependencies {
//                implementation("junit:junit:4.13.2")
//            }
//        }
        val desktopMain by getting {
            //kotlin.srcDir("build/generated/ksp/desktop/desktopMain/kotlin")
            dependencies {
                implementation("app.cash.sqldelight:sqlite-driver:2.0.0-alpha05")
                implementation("io.insert-koin:koin-core:3.3.3")
              //  implementation("io.insert-koin:koin-annotations:1.1.1")
                // api(compose.preview)
            }
        }
        // val desktopTest by getting
    }
}

android {
    compileSdk = 33
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = 25
    }
    buildFeatures {
        compose = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    namespace = "com.example.common"

//    kapt {
//        correctErrorTypes = true
//    }
////
//    hilt {
//        enableAggregatingTask = true
//    }
}
//
//dependencies {
////    add("kspCommonMainMetadata", project(":test-processor"))
////    add("kspAndroid", project(":test-processor"))
//
//    add("kspCommonMainMetadata", "io.insert-koin:koin-ksp-compiler:1.1.1")
//    add("kspAndroid", "io.insert-koin:koin-ksp-compiler:1.1.1")
////
//// Not doing anything because there's no test source set for JVM
//    // There is no processing for the Linux x64 main source set, because kspLinuxX64 isn't specified
//  //  add("kspLinuxX64Test", project(":test-processor"))
//
//    //add("kspJvm", "io.insert-koin:koin-ksp-compiler:1.1.1")
//
////    //add("kspMetadata", "io.insert-koin:koin-ksp-compiler:1.1.1")
////    //add("kspIosX64","io.insert-koin:koin-ksp-compiler:1.1.1")
////    // add("kspIosSimulatorArm64","io.insert-koin:koin-ksp-compiler:1.1.1")
//}

sqldelight {
    databases {
        create("Database") {
            packageName.set("com.example")
        }
    }
}