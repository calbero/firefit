package samples.calbero.firefit.ui.profile

class ProfilePresenter : ProfileContract.Presenter {

    private var view: ProfileContract.View? = null

    override fun takeView(view: ProfileContract.View) {
        this.view = view
    }

    override fun dropView() {
        this.view = null
    }
}