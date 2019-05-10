import org.jetbrains.kotlin.gradle.plugin.KaptExtension
import kotlin.math.max

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Plugins.androidGradle)
        classpath(Plugins.kotlinGradle)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}
