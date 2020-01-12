package com.example.stacjepogodowe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var gson = Gson()
        var station = Station(-5, "Omujborze")
        val json = gson.toJson(station)
        this.test.setText(json)
        val deser = gson.fromJson(json, Station::class.java)

        Log.d("haba", deser.stationId.toString() + " " + deser.stationName)
    }
}
