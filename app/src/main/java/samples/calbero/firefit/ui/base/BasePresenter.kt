package samples.calbero.firefit.ui.base

interface BasePresenter<T> {

    fun takeView(view: T)

    fun dropView()

}