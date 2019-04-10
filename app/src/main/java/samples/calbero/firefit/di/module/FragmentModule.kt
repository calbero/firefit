package samples.calbero.firefit.di.module

import dagger.Module
import dagger.Provides
import samples.calbero.firefit.ui.graph.GraphContract
import samples.calbero.firefit.ui.graph.GraphPresenter
import samples.calbero.firefit.ui.home.HomeContract
import samples.calbero.firefit.ui.home.HomePresenter
import samples.calbero.firefit.ui.login.LoginContract
import samples.calbero.firefit.ui.login.LoginPresenter
import samples.calbero.firefit.ui.profile.ProfileContract
import samples.calbero.firefit.ui.profile.ProfilePresenter

@Module
class FragmentModule {

    @Provides
    fun provideLoginFragment(): LoginContract.Presenter = LoginPresenter()

    @Provides
    fun provideHomeFragment(): HomeContract.Presenter = HomePresenter()

    @Provides
    fun provideGraphFragment(): GraphContract.Presenter = GraphPresenter()

    @Provides
    fun provideProfileFragment(): ProfileContract.Presenter = ProfilePresenter()
}