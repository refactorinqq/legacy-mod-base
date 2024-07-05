plugins {
    kotlin("jvm") version "2.0.0"

    alias(libs.plugins.loom)
    alias(libs.plugins.loom.legacy)
}

group = "dev.refactoring"
version = properties["version"]!!

repositories {
    mavenCentral()
}

val gameVersion by properties
val loaderVersion by properties

val mappings by properties

dependencies {
    "minecraft"("com.mojang:minecraft:$gameVersion")
    "mappings"("net.legacyfabric:yarn:1.8.9+build.$mappings:v2")

    "modImplementation"("net.fabricmc:fabric-loader:$loaderVersion")
}

kotlin {
    jvmToolchain(17)
}