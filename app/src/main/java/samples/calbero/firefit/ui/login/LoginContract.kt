package samples.calbero.firefit.ui.login

import samples.calbero.firefit.ui.base.BasePresenter
import samples.calbero.firefit.ui.base.BaseView

interface LoginContract {

    interface View : BaseView<Presenter>

    interface Presenter : BasePresenter<View>

}