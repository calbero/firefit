package samples.calbero.firefit.ui.home

class HomePresenter : HomeContract.Presenter {

    private var view: HomeContract.View? = null

    override fun takeView(view: HomeContract.View) {
        this.view = view
    }

    override fun dropView() {
        this.view = null
    }
}