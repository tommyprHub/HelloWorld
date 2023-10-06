package com.example.helloworld.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.R

class UIActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uiactivity)
    }
}