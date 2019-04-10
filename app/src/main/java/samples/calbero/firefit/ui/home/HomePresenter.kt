package samples.calbero.firefit.ui.home

import org.jetbrains.anko.doAsync
import samples.calbero.firefit.MainApp
import samples.calbero.firefit.model.Record
import samples.calbero.firefit.model.User
import java.util.*

class HomePresenter : HomeContract.Presenter {

    private var view: HomeContract.View? = null
    private val userDao = MainApp.database.userDao()
    private val recordDao = MainApp.database.recordDao()

    override fun roomService() {
        doAsync {
            val user = User(null, "Carlos", "Albero", 80.0, 180.0, 27)
            val userId = userDao.insert(user)
            val record = Record(null, userId, 10, 80.0, Date().toString())
            recordDao.insert(record)
        }
    }

    override fun takeView(view: HomeContract.View) {
        this.view = view
    }

    override fun dropView() {
        this.view = null
    }
}