import java.io.File
import java.nio.file.Files
import java.util.Properties

object Versions {
    val kotlin = "1.3.31"

    // Plugins
    val androidGradlePlugin = Properties().apply {
        load(Files.newBufferedReader(File("buildSrc", "gradle.properties").toPath()))
    }.getProperty("agpVersion")
}

object Plugins {
    val androidGradle = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"
    val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}
