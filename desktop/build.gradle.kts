import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("multiplatform")
    // id("org.jetbrains.compose")
    id("org.jetbrains.compose") version "1.3.1"
    //id("com.google.devtools.ksp") version "1.8.0-1.0.9"
}

group = "com.example"
version = "1.0-SNAPSHOT"

// KSP - To use generated sources
//sourceSets.main {
//    java.srcDirs("build/generated/ksp/main/kotlin")
//}
kotlin {
    jvm {
        jvmToolchain(11)
        withJava()
    }
    sourceSets {
        val jvmMain by getting {
//            kotlin.srcDir("build/generated/ksp/main/kotlin")
            // kotlin.srcDir(File("build/generated/ksp/desktopMain/kotlin"))
            // kotlin.srcDir("build/generated/ksp/jvm/jvmMain/kotlin")
            dependencies {
                implementation(project(":common"))
//                implementation("org.jetbrains.compose.desktop:desktop:1.3.1")
//
//                implementation("androidx.compose.runtime:runtime:1.3.3")
//                implementation("androidx.compose.foundation:foundation:1.3.1")
//                implementation("androidx.compose.material:material:1.3.1")
//                implementation("androidx.compose.ui:ui:1.3.3")

                implementation(compose.desktop.currentOs)
                implementation("io.insert-koin:koin-core:3.3.3")

                // implementation("io.insert-koin:koin-annotations:1.1.1")
                //api(compose.runtime)
                // api(compose.foundation)
                // api(compose.material)
                //api(compose.preview)
                //api(compose.ui)
                //   implementation("androidx.compose.ui:ui:1.3.3")
                // api(compose.uiTooling)
//                implementation("androidx.compose.runtime:runtime:1.3.3")
//                implementation("androidx.compose.foundation:foundation:1.3.1")
//                implementation("androidx.compose.material:material:1.3.1")
//                implementation("androidx.compose.ui:ui:1.3.3")
            }
        }
        //val jvmTest by getting
    }
}

compose.desktop {
    application {

        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(
                TargetFormat.Dmg,
                TargetFormat.Msi,
                TargetFormat.Deb
            )
            packageName = "MyFirstKMMDesktopApp"
            packageVersion = "1.0.0"
        }
    }
}
