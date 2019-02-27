package samples.calbero.firefit.ui.login

import android.os.Bundle
import samples.calbero.firefit.R
import samples.calbero.firefit.ui.base.BaseActivity

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        val loginFragment = supportFragmentManager.findFragmentById(R.id.contentFrame) as LoginFragment?
        ?: LoginFragment.newInstance().also { replaceFragmentInActivity(it, R.id.contentFrame) }
    }

}