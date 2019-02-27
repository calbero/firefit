package samples.calbero.firefit.ui.main

import android.os.Bundle
import samples.calbero.firefit.R
import samples.calbero.firefit.ui.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        val mainFragment = supportFragmentManager.findFragmentById(R.id.contentFrame) as MainFragment?
            ?: MainFragment.newInstance().also { replaceFragmentInActivity(it, R.id.contentFrame) }
    }

    override fun onBackPressed() {

    }
}