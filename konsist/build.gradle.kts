plugins {
    alias(libs.plugins.paper.trader.android.library)
}

android {
    namespace = "ir.vahid.konsist"
}

dependencies {
    testImplementation(libs.bundles.kotest)
    testImplementation(libs.konsist)
}
