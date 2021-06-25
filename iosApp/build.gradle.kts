plugins {
    id("org.jetbrains.gradle.apple.applePlugin") version "211.5739-0.12"
}

apple {
    iosApp {
        productName = "appcode_kmm_preset"

        sceneDelegateClass = "SceneDelegate"
        launchStoryboard = "LaunchScreen"

        //productInfo["NSAppTransportSecurity"] = mapOf("NSAllowsArbitraryLoads" to true)
        //buildSettings["OTHER_LDFLAGS"] = ""

        dependencies {
            implementation(project(":shared"))
        }
    }
}
