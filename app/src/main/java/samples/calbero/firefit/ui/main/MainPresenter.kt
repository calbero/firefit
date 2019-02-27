package samples.calbero.firefit.ui.main

class MainPresenter : MainContract.Presenter {

    private var view: MainContract.View? = null

    override fun takeView(view: MainContract.View) {
        this.view = view
    }

    override fun dropView() {
        this.view = null
    }

}