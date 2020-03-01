package com.appshive.crosskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appshive.Greetings
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        greeting.text = Greetings().greeting()
    }
}
