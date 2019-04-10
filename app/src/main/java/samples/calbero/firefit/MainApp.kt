package samples.calbero.firefit

import android.app.Application
import androidx.room.Room
import com.facebook.stetho.Stetho
import samples.calbero.firefit.di.component.DaggerAppComponent
import samples.calbero.firefit.model.MainDatabase

class MainApp : Application() {

    companion object {
        lateinit var database: MainDatabase
    }

    override fun onCreate() {
        super.onCreate()
        initDagger()
        initStetho()
        initDatabase()
    }

    private fun initDagger() {
        val appComponent = DaggerAppComponent.builder()
            .application(this).build()
        appComponent.inject(this)
    }

    private fun initStetho() {
        Stetho.initializeWithDefaults(this)
    }

    private fun initDatabase() {
        MainApp.database = Room.databaseBuilder(
            this, MainDatabase::class.java, "main-db"
        ).build()
    }
}