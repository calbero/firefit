package samples.calbero.firefit.di.component

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import samples.calbero.firefit.MainApp
import samples.calbero.firefit.di.module.AppModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

    fun inject(app: MainApp)
}