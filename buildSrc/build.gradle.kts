plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

repositories {
    google()
    jcenter()
}

dependencies {
    val agpVersion = findProperty("agpVersion").toString()
    compileOnly("com.android.tools.build:gradle:$agpVersion")
    runtimeClasspath("com.android.tools.build:gradle:$agpVersion")
}
