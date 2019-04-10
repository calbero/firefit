package samples.calbero.firefit.di.component

import dagger.Component
import samples.calbero.firefit.di.module.FragmentModule
import samples.calbero.firefit.ui.graph.GraphFragment
import samples.calbero.firefit.ui.home.HomeFragment
import samples.calbero.firefit.ui.login.LoginFragment
import samples.calbero.firefit.ui.profile.ProfileFragment

@Component(modules = [FragmentModule::class])
interface FragmentComponent {

    fun inject(fragment: LoginFragment)

    fun inject(fragment: HomeFragment)

    fun inject(fragment: GraphFragment)

    fun inject(fragment: ProfileFragment)
}