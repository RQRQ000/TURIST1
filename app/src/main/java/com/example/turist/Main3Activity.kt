package com.example.turist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.SpinnerAdapter
import kotlinx.android.synthetic.main.activity_main3.*

val NUMBER_SIGHTS = "number"

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        list.setOnItemClickListener { adapterView, view, i, l ->
            var intent : Intent = Intent(this, Main2Activity::class.java)
            intent.putExtra(NUMBER_SIGHTS,i)
            startActivity(intent)
        }


    }
}
