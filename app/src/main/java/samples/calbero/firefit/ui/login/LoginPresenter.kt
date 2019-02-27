package samples.calbero.firefit.ui.login

class LoginPresenter : LoginContract.Presenter {

    private var view: LoginContract.View? = null

    override fun takeView(view: LoginContract.View) {
        this.view = view
    }

    override fun dropView() {
        this.view = null
    }
}