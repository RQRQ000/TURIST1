package com.example.turist

import `values-en`.Sights
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

object Sights1 {
    lateinit var Activity : Main2Activity

    val mass : MutableList<Sights> = mutableListOf()

     var picture: Array<Int> = arrayOf( R.drawable.nulevoykilometr,R.drawable.demidovskystolp,
         R.drawable.corolevavaz,R.drawable.vasaizyashmy,R.drawable.belorexkiyvaza,R.drawable.pamatnystolp,
         R.drawable.ubileynayvaza,R.drawable.vasakolivanskixmasterov,R.drawable.florenskaymmozayka,
         R.drawable.yistokovvelikoyreki,R.drawable.molodostaltay,R.drawable.mazaykaozeromoxovoe,
         R.drawable.mozaykapodvodnymir,R.drawable.samoekrupnoe,R.drawable.prirodaaltay)

    var discriprion  = Activity.resources.getIntArray(R.array.sights_history)
     var discriprionname = Activity.resources.getIntArray(R.array.sights_name)
   fun Pictureview(){
       for ( i in 0..discriprionname.size - 1) {
           val s: Sights = Sights(discriprionname[i], discriprion[i], picture[i] )
           mass.add(s)
           Pictureview()

       }

   }

}
