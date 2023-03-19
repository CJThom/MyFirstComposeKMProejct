plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("app.cash.sqldelight")
}

kotlin {

    android()
    jvm("desktop") {
        jvmToolchain(11)
    }
    sourceSets {
        val commonMain by getting {

            dependencies {
                implementation(project(":core:domain"))
                implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.4.0")
                implementation("io.insert-koin:koin-core:3.3.3")
            }
        }
        val androidMain by getting {
            dependencies {
                //dependsOn(commonMain)

                api("androidx.core:core-ktx:1.9.0")
                implementation("app.cash.sqldelight:android-driver:2.0.0-alpha05")

                implementation("io.insert-koin:koin-core:3.3.3")
                implementation("io.insert-koin:koin-android:3.3.3")

                implementation("io.insert-koin:koin-core:3.3.3")
            }
        }
        val desktopMain by getting {
            dependencies {
                implementation("app.cash.sqldelight:sqlite-driver:2.0.0-alpha05")
                implementation("io.insert-koin:koin-core:3.3.3")
            }
        }
    }
}

android {
    compileSdk = 33
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = 25
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    namespace = "com.example.data.common"

}
//
//sqldelight {
//    databases {
//        create("Database") {
//            packageName.set("com.example.data")
//        }
//    }
//}