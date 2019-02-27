package samples.calbero.firefit

import android.app.Application
import samples.calbero.firefit.di.component.DaggerAppComponent

class MainApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    private fun initDagger() {
        val appComponent = DaggerAppComponent.builder()
            .application(this).build()
        appComponent.inject(this)
    }
}