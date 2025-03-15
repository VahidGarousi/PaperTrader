import com.android.build.api.dsl.ApplicationExtension
import com.android.build.gradle.AbstractAppExtension
import com.google.devtools.ksp.gradle.KspExtension
import ir.vahid.trader.configureGeneratedKoinApplication
import ir.vahid.trader.configureKoinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.getByType

class AndroidLibraryKoinConventionPlugin : Plugin<Project> {
    override fun apply(project: Project) = project.run {
        apply("com.google.devtools.ksp")
        extensions.configure<KspExtension> {
            arg("KOIN_CONFIG_CHECK", "true")
        }

        val abstractAppExtension = extensions.getByType<AbstractAppExtension>()
        configureGeneratedKoinApplication(abstractAppExtension)

        val applicationExtension = extensions.getByType<ApplicationExtension>()
        configureKoinAndroid(applicationExtension)
    }
}

