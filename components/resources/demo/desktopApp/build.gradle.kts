plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

kotlin {
    jvm {}
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(compose.desktop.currentOs)
                implementation(project(":resources:demo:shared"))
            }
        }
    }
}

compose.desktop {
    application {
        mainClass = "MainKt"
    }
}
