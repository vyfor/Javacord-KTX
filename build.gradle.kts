plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "blast"
version = "0.1"

repositories {
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots/")
}

dependencies {
    implementation("org.javacord:javacord:3.9.0-SNAPSHOT")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    
    runtimeOnly("org.jetbrains.kotlin:kotlin-scripting-jsr223:$1.9.0")
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}