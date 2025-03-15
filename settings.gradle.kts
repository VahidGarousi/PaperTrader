pluginManagement {
    includeBuild("build-logic")
    repositories {
        maven("https://maven.myket.ir")
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven("https://maven.myket.ir")
        google()
        mavenCentral()
    }
}

rootProject.name = "PaperTrader"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include(":konsist")
include(":app")
include(":core:domain")
include(":core:screenshot-testing")
include(":core:design-system")
include(":feature:explore")

check(JavaVersion.current().isCompatibleWith(JavaVersion.VERSION_17)) {
    """
    Paper Trader requires JDK 17+ but it is currently using JDK ${JavaVersion.current()}.
    Java Home: [${System.getProperty("java.home")}]
    https://developer.android.com/build/jdks#jdk-config-in-studio
    """.trimIndent()
}
