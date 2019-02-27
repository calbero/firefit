package samples.calbero.firefit.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.main_fragment.*
import samples.calbero.firefit.R
import samples.calbero.firefit.ui.base.BaseFragment
import samples.calbero.firefit.ui.graph.GraphFragment
import javax.inject.Inject

class MainFragment : BaseFragment(), MainContract.View {

    @Inject lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectDependency().inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        main_button.setOnClickListener {
            replaceFragment(GraphFragment.newInstance(), R.id.contentFrame)
        }
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
        fun newInstance(): MainFragment = MainFragment().apply {}
    }

}