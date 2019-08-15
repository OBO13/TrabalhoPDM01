package com.example.apptrabalho01

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        var params = intent.extras
        var texto = params?.getString("TEXTO")
        numtxt.setText(texto)
    }

    fun btnok (view: View) {
        var i = Intent(this, MainActivity::class.java)
        var b = Bundle()
        var mensagem = dgtText.text.toString()
        b.putString("TEXTO", mensagem)
        i.putExtras(b)
        startActivity(i)
    }


    fun btncancelar (view: View) {
        var i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}



