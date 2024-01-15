pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "TPEni"
include(":app")
include(":app:M03TP1")
include(":app:TP302")
include(":app:tp402")
include(":app:m05tp1")
include(":app:m05tp2")
