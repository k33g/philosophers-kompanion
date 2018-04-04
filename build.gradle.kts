import org.gradle.api.tasks.JavaExec
import org.gradle.script.lang.kotlin.extra
import org.gradle.script.lang.kotlin.kotlinModule
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.js.translate.context.Namer.kotlin

buildscript {
    var kotlin_version: String by extra
    kotlin_version = "1.2.31"

    repositories {
        jcenter()
    }
    dependencies {
        classpath(kotlinModule("gradle-plugin", kotlin_version))
    }
}

group = "com.okamidev"
version = "1.0-SNAPSHOT"

apply {
    plugin("kotlin")
}

plugins {
    application
}

val kotlin_version: String by extra
val vertxVersion = "3.5.1"

repositories {
    jcenter()
}

dependencies {
    compile(kotlinModule("stdlib-jdk8", kotlin_version))

    "io.vertx:vertx".let { v ->
        compile("$v-core:$vertxVersion")
        compile("$v-web:$vertxVersion")
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

val mainVerticleName = "com.okamidev.api.MainVerticle"
val launcherClass = "io.vertx.core.Launcher"


tasks {
    "run"(JavaExec::class) {
        val watchForChange = "src/**/*"
        val doOnChange = "./gradlew classes"

        main = launcherClass

        args("run", mainVerticleName,
                "--redeploy=$watchForChange",
                "--launcher-class=$launcherClass",
                "--on-redeploy=$doOnChange")
    }
}