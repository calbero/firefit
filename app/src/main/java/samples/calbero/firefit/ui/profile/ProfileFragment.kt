package samples.calbero.firefit.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import samples.calbero.firefit.R
import samples.calbero.firefit.ui.base.BaseFragment
import javax.inject.Inject

class ProfileFragment : BaseFragment(), ProfileContract.View {

    @Inject lateinit var presenter: ProfileContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectDependency().inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.profile_fragment, container, false)
        return view
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
        fun newInstance(): ProfileFragment = ProfileFragment().apply { }
    }
}