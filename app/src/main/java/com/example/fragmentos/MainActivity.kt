package com.example.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var calcu = findViewById<Button>(R.id.calc)
        var imc = findViewById<Button>(R.id.imc)

        replaceFragmento(Inicio())
        calcu.setOnClickListener {
            replaceFragmento(Calculadora())
        }

        imc.setOnClickListener {
            replaceFragmento(IMC())
        }
    }

    public fun replaceFragmento (fragmento: Fragment)
    {
        val manager = supportFragmentManager
        val transaccion = manager.beginTransaction()
        transaccion.replace(R.id.fragmentContainerView, fragmento)
        transaccion.commit()
    }
}