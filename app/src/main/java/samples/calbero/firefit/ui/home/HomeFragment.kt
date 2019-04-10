package samples.calbero.firefit.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import samples.calbero.firefit.R
import samples.calbero.firefit.ui.base.BaseFragment
import javax.inject.Inject

class HomeFragment : BaseFragment(), HomeContract.View {

    @Inject lateinit var presenter: HomeContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectDependency().inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.home_fragment, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.roomService()
    }

    companion object {
        fun newInstance(): HomeFragment = HomeFragment().apply { }
    }

}