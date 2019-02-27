package samples.calbero.firefit.ui.graph

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.graph_fragment.*
import samples.calbero.firefit.R
import samples.calbero.firefit.ui.base.BaseFragment
import javax.inject.Inject

class GraphFragment : BaseFragment(), GraphContract.View {

    @Inject lateinit var presenter: GraphContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectDependency().inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.graph_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        graph.addSeries(presenter.drawGraph())
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
        fun newInstance(): GraphFragment = GraphFragment().apply { }
    }

}