import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.variant.ApplicationAndroidComponentsExtension
import com.android.build.gradle.BaseExtension
import ir.vahid.trader.applyPlugin
import ir.vahid.trader.configureBadgingTasks
import ir.vahid.trader.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.getByType


class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
                apply("paper.trader.android.ktlint")
                apply("com.dropbox.dependency-guard")
                apply("paper.trader.android.detekt")
                apply("com.squareup.sort-dependencies")
            }
            applyPlugin(pluginId = "paper-trader-android-koin-application")
            extensions.configure<ApplicationExtension> {
                configureKotlinAndroid(this)
                defaultConfig.targetSdk = TARGET_SDK_VERSION
                testOptions.animationsDisabled = true
//                configureGradleManagedDevices(this)
            }
            extensions.configure<ApplicationAndroidComponentsExtension> {
//                configurePrintApksTask(this)
                configureBadgingTasks(extensions.getByType<BaseExtension>(), this)
            }
        }
    }
}
