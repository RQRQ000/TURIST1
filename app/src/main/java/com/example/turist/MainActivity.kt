package com.example.turist

import `values-en`.Sights
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
  //  var pi: Sights = Sights("Нулевой километр", R.drawable.nulevoykilometr, resources.getString(R.string.kilohistory))


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
}
