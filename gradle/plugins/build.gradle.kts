@file:Suppress(
    // `val prop_name: String by project` is the simplest way for now, will get better with Version Catalogs.
    "VariableNaming"
)

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

gradlePlugin {
    plugins {
        create("com.demo.greeting") {
            id = "com.demo.greeting"
            implementationClass = "com.demo.greeting.GreetingPlugin"
        }
    }
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(gradleApi())
    implementation(localGroovy())

}
