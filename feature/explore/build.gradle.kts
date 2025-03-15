plugins {
    alias(libs.plugins.paper.trader.android.library)
    alias(libs.plugins.paper.trader.android.library.compose)
    alias(libs.plugins.paper.trader.kotest)
}

android {
    namespace = "ir.paper.trader.explore"
}
