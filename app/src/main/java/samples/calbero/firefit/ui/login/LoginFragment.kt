package samples.calbero.firefit.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.login_fragment.*
import samples.calbero.firefit.R
import samples.calbero.firefit.ui.base.BaseFragment
import samples.calbero.firefit.ui.main.MainActivity
import javax.inject.Inject

class LoginFragment : BaseFragment(), LoginContract.View {

    @Inject lateinit var presenter: LoginContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectDependency().inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.login_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        login_button.setOnClickListener {
            activity?.startActivity(Intent(activity, MainActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        presenter.takeView(this)
    }

    override fun onStop() {
        presenter.dropView()
        super.onStop()
    }

    companion object {
        fun newInstance(): LoginFragment = LoginFragment().apply {}
    }

}