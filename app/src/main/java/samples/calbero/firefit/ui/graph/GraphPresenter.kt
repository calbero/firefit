package samples.calbero.firefit.ui.graph

import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries

class GraphPresenter : GraphContract.Presenter {

    private var view: GraphContract.View? = null

    override fun drawGraph(): LineGraphSeries<DataPoint> {
      return LineGraphSeries(generatePoints())
    }

    private fun generatePoints(): Array<DataPoint> {
        return arrayOf(
            DataPoint(70.0, 1.0),
            DataPoint(73.0, 2.0),
            DataPoint(76.0, 4.0),
            DataPoint(78.0, 5.0),
            DataPoint(81.0, 7.0)
        )
    }

    override fun takeView(view: GraphContract.View) {
        this.view = view
    }

    override fun dropView() {
        this.view = null
    }
}