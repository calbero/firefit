package samples.calbero.firefit.ui.base

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import samples.calbero.firefit.di.component.DaggerFragmentComponent
import samples.calbero.firefit.di.component.FragmentComponent
import samples.calbero.firefit.di.module.FragmentModule

abstract class BaseFragment : Fragment() {

    protected fun injectDependency(): FragmentComponent {
        return DaggerFragmentComponent.builder()
            .fragmentModule(FragmentModule())
            .build()
    }


    protected fun replaceFragment(fragment: Fragment, @IdRes frameId: Int) {
        fragmentManager?.transact {
            replace(frameId, fragment).addToBackStack("fragment")
        }
    }

    private inline fun FragmentManager.transact(action: FragmentTransaction.() -> Unit) {
        beginTransaction().apply {
            action()
        }.commit()
    }

}