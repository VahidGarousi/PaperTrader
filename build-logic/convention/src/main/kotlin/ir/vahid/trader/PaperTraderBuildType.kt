package ir.vahid.trader

/**
 * This is shared between :app and :benchmarks module to provide configurations type safety.
 */
enum class PaperTraderBuildType(val versionNameSuffix: String? = null) {
    DEBUG(".debug"),
    RELEASE,
}
