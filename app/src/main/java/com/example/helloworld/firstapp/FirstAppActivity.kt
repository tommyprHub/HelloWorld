package com.example.helloworld.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.R

//esta es la parte lógica, toda parte lógica tiene su parte visual
//en este caso, la parte visual es activity_first_app y se encuentra en res>layout
class FirstAppActivity : AppCompatActivity() {
    //a la pantalla onCreate le engancho el diseño de activity_first_app
    override fun onCreate(savedInstanceState: Bundle?) {
        //si quiero que algo se haga al principio lo haría aqui (al arrancar la pantalla)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
    }
}