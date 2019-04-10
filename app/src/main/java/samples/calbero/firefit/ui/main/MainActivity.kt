package samples.calbero.firefit.ui.main

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.main_activity.*
import samples.calbero.firefit.R
import samples.calbero.firefit.ui.base.BaseActivity
import samples.calbero.firefit.ui.base.BaseFragment
import samples.calbero.firefit.ui.graph.GraphFragment
import samples.calbero.firefit.ui.home.HomeFragment
import samples.calbero.firefit.ui.profile.ProfileFragment
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject lateinit var presenter: MainContract.Presenter
    private lateinit var navigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        replaceFragmentInActivity(HomeFragment.newInstance(), R.id.contentFrame)
        setNavigationView()
    }

    private fun setNavigationView() {
        navigationView = bottom_navigation
        navigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.menu_item_home -> replaceFragment(HomeFragment.newInstance())
                R.id.menu_item_history -> replaceFragment(GraphFragment.newInstance())
                else -> replaceFragment(ProfileFragment.newInstance())
            }
        }
    }

    private fun replaceFragment(fragment: BaseFragment): Boolean {
        replaceFragmentInActivity(fragment, R.id.contentFrame)
        return true
    }
}