package com.example.helloworld.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.helloworld.R

//esta es la parte lógica, toda parte lógica tiene su parte visual
//en este caso, la parte visual es activity_first_app y se encuentra en res>layout
class FirstAppActivity : AppCompatActivity() {
    //a la pantalla onCreate le engancho el diseño de activity_first_app
    override fun onCreate(savedInstanceState: Bundle?) {
        //si quiero que algo se haga al principio lo haría aqui (al arrancar la pantalla)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val btnClick = findViewById<AppCompatButton>(R.id.btnClick)
        val etname = findViewById<AppCompatEditText>(R.id.etname)

        val text = "Aplicación abierta"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(this, text, duration) // in Activity
        toast.show()


        btnClick.setOnClickListener {
            val name = etname.text.toString()

            if(name.isNotEmpty()){
                //Log.i("Tommy","Boton pulsado $name")
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME",name)
                startActivity(intent)

            }
        }




    }
}