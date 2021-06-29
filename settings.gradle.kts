pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
    }
    
}
rootProject.name = "appcode_kmm_preset"


include(":iosApp")
include(":androidApp")
include(":shared")

