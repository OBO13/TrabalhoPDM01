package com.example.apptrabalho01

import android.app.Activity
import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.apptrabalho01.R.drawable.img1
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2 : AppCompatActivity() {

   
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)


        var params = intent.extras
        var imagem = params?.getInt("TEXTO")
        if (imagem != null) {
            img1.setImageResource(imagem)
        }
    }

    fun btnok(view: View) {

        var i = Intent(this, Tela2::class.java)
        var mensagem = dgtText.text.toString()
        i.putExtra("TEXTO", mensagem)
        setResult(Activity.RESULT_OK, i)
        finish()
    }
    fun btncancelar(view: View) {

            var i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

}





