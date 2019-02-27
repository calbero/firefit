package samples.calbero.firefit.di.module

import dagger.Module
import dagger.Provides
import samples.calbero.firefit.ui.graph.GraphContract
import samples.calbero.firefit.ui.graph.GraphPresenter
import samples.calbero.firefit.ui.login.LoginContract
import samples.calbero.firefit.ui.login.LoginPresenter
import samples.calbero.firefit.ui.main.MainContract
import samples.calbero.firefit.ui.main.MainPresenter

@Module
class FragmentModule {

    @Provides
    fun provideLoginFragment(): LoginContract.Presenter = LoginPresenter()

    @Provides
    fun provideMainFragment(): MainContract.Presenter = MainPresenter()

    @Provides
    fun provideGraphFragment(): GraphContract.Presenter = GraphPresenter()
}