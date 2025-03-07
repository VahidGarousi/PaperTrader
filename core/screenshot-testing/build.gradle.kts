plugins {
    alias(libs.plugins.paper.trader.android.library)
    alias(libs.plugins.paper.trader.android.library.compose)
//    alias(libs.plugins.paper.trader.hilt)
}

android {
    namespace = "ir.vahid.core.screenshot_testing"
}

dependencies {
    api(libs.bundles.androidx.compose.ui.test)
    api(libs.roborazzi)
    api(libs.roborazzi.accessibility.check)

    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.ui.test)
    implementation(libs.robolectric)
    implementation(projects.core.designSystem)
}
