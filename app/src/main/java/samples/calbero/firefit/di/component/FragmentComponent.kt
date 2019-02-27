package samples.calbero.firefit.di.component

import dagger.Component
import samples.calbero.firefit.di.module.FragmentModule
import samples.calbero.firefit.ui.graph.GraphFragment
import samples.calbero.firefit.ui.login.LoginFragment
import samples.calbero.firefit.ui.main.MainFragment

@Component(modules = [FragmentModule::class])
interface FragmentComponent {

    fun inject(fragment: LoginFragment)

    fun inject(fragment: MainFragment)

    fun inject(fragment: GraphFragment)
}