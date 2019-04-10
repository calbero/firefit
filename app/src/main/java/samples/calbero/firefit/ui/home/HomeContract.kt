package samples.calbero.firefit.ui.home

import samples.calbero.firefit.ui.base.BasePresenter
import samples.calbero.firefit.ui.base.BaseView

interface HomeContract {

    interface View : BaseView<Presenter>

    interface Presenter : BasePresenter<View>

}