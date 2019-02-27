package samples.calbero.firefit.ui.graph

import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
import samples.calbero.firefit.ui.base.BasePresenter
import samples.calbero.firefit.ui.base.BaseView

interface GraphContract {

    interface Presenter : BasePresenter<View> {

        fun drawGraph(): LineGraphSeries<DataPoint>

    }

    interface View : BaseView<Presenter>
}