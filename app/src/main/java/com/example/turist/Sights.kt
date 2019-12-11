package `values-en`

import android.graphics.PointF

class Sights(name: Int, picture: Int, history: Int) {
    var onmap : PointF = PointF()
    var history : Int= history
    var picture : Int = picture
    var name : String = name.toString()

}

