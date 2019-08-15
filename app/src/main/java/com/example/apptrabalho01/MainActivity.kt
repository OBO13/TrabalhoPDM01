package com.example.apptrabalho01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.graphics.toColor
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_tela2.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var params = intent.extras
        var texto = params?.getString("TEXTO")
        resp_1.setText(texto)
    }


    fun btn1 (view: View) {

        var A = "12"

        var i = Intent(this, Tela2::class.java)
        var b = Bundle()
        var mensagem = R.drawable.img1
        b.putString("TEXTO", A)
        i.putExtras(b)
        startActivity(i)



    }
}
