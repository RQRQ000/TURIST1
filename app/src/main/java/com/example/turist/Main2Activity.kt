package com.example.turist

import android.graphics.Picture
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*
import `values-en`.Sights as Sights2

class Main2Activity : AppCompatActivity() {
   lateinit var history : TextView
    lateinit var discriprion : Array<String>
    lateinit var namesight : TextView
    lateinit var discriprionname:Array<String>
    lateinit var sightpicture: ImageView

    var j = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        discriprion = resources.getStringArray(R.array.sights_history)
        discriprionname = resources.getStringArray(R.array.sights_name)


        history = findViewById(R.id.history1)
        namesight = findViewById(R.id.textview)



      //  for(i in 0..discriprionname.size-1)
//        Sights1.mass.add(
//            Sights(discriprionname[i], R.drawable.nulevoykilometr, discriprion[i]))
        //discriprion[intent!!.getIntExtra(NUMBER_SIGHTS,0)]
        //discriprionname[intent!!.getIntExtra(NUMBER_SIGHTS,0)]
    }

    fun test(v:View){
        Shoofun(Sights1.mass[j])
        j++
        Log.d("test", j.toString())
    }
    fun Shoofun(s : Sights2) {

        history.text = getString(s.history)
        namesight.text = getString(s.name.toInt())
    }


}
