package com.dam2.pruebamvvc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Instanciamos el ViewModel
        // nomenclatura que necesita utilizar jvm 1.8
        // se configure en project structure -> Modules -> Target Compatibillity
        val miModelo by viewModels<MyViewModel>()
        miModelo.ronda.value
        val texto = findViewById<TextView>(R.id.textRonda)

    }
}