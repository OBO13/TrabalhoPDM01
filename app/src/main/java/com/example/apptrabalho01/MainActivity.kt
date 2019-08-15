package com.example.apptrabalho01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var params = intent.extras
        var texto = params?.getString("TEXTO")
        resp1.setText(texto)
    }

    fun btn1(view: View) {

        var A = "5"

        var i = Intent(this, Tela2::class.java)
        var b = Bundle()
        //var mensagem = R.drawable.img1
        b.putString("TEXTO", A)
        i.putExtras(b)
        startActivity(i)
    }

    fun btn2(view: View) {

        var A = "6"

        var i = Intent(this, Tela2::class.java)
        var b = Bundle()
        //var mensagem = R.drawable.img1
        b.putString("TEXTO", A)
        i.putExtras(b)
        startActivity(i)
    }

    fun btn3(view: View) {

        var A = "8"

        var i = Intent(this, Tela2::class.java)
        var b = Bundle()
        //var mensagem = R.drawable.img1
        b.putString("TEXTO", A)
        i.putExtras(b)
        startActivity(i)
    }

    fun btnverificar(view: View) {

        //var Resposta1 : String = resp1.text.toString();
        //var Resposta2 : String = resp2.text.toString();
        //var Resposta3 : String = resp3.text.toString();

        

        var A = "verdadeiro"
        var B = "Falso"

        if (resp1.equals("5")) {
            //Toast.makeText(this, A,   Toast.LENGTH_SHORT).show()
            result.setText(A)
        } else
        //Toast.makeText(this, B,   Toast.LENGTH_SHORT).show()
            result.setText(B)
    }


    }

