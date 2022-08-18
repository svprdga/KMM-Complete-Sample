package com.svprdga.kmmcompletesample.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.svprdga.kmmcompletesample.Greeting
import android.widget.TextView
import com.svprdga.kmmcompletesample.SharedData

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = SharedData.myString.toString(this)
    }
}
