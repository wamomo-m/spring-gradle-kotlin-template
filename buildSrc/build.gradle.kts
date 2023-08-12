plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0")
    implementation("org.jetbrains.kotlin:kotlin-allopen:1.9.0")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:3.1.2")
}
