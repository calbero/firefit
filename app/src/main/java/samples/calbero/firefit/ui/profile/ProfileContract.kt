package samples.calbero.firefit.ui.profile

import samples.calbero.firefit.ui.base.BasePresenter
import samples.calbero.firefit.ui.base.BaseView

interface ProfileContract {

    interface View: BaseView<Presenter>

    interface Presenter: BasePresenter<View>
}