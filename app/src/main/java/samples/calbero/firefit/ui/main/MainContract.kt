package samples.calbero.firefit.ui.main

import samples.calbero.firefit.ui.base.BasePresenter
import samples.calbero.firefit.ui.base.BaseView

interface MainContract {

    interface View : BaseView<Presenter>

    interface Presenter : BasePresenter<View>
}