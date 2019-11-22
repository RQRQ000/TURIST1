package com.example.turist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Main2Activity : AppCompatActivity() {
   lateinit var history : TextView
    lateinit var discriprion : Array<String>
    lateinit var namesight : TextView
    lateinit var discriprionname:Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        history = findViewById(R.id.history1)
        namesight = findViewById(R.id.textview)
        discriprion = resources.getStringArray(R.array.sights_history)
        discriprionname = resources.getStringArray(R.array.sights_name)
        history.text = discriprion[intent!!.getIntExtra(NUMBER_SIGHTS,0)]
        namesight.text = discriprionname[intent!!.getIntExtra(NUMBER_SIGHTS,0)]

    }
}
