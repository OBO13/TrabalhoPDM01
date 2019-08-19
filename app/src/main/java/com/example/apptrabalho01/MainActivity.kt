package com.example.apptrabalho01

import android.app.Activity
import android.app.Activity.RESULT_OK
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_tela2.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                Activity.RESULT_OK
                val param = data?.extras
                val R1 = param?.getString("TEXTO")
                resp1.setText(R1)
            }
        } else {
            if (requestCode == 2) {
                if (resultCode == RESULT_OK) {
                    Activity.RESULT_OK
                    val param = data?.extras
                    val R2 = param?.getString("TEXTO")
                    resp2.setText(R2)
                }
            } else {
                if (requestCode == 3) {
                    if (resultCode == RESULT_OK) {
                        Activity.RESULT_OK
                        val param = data?.extras
                        val R3 = param?.getString("TEXTO")
                        resp3.setText(R3)
                    }
                }
            }
        }
    }

    fun btn1(view: View) {
        val MY_RESULT_CODE = 99
        var A = R.drawable.img2
        var i = Intent(this, Tela2::class.java)
        var b = Bundle()
        b.putInt("TEXTO", A)
        i.putExtras(b)
        startActivityForResult(i, 1)
    }

    fun btn2(view: View) {

        val MY_RESULT_CODE = 99
        var B = R.drawable.img3
        var i = Intent(this, Tela2::class.java)
        var b = Bundle()
        b.putInt("TEXTO", B)
        i.putExtras(b)
        startActivityForResult(i, 2)
    }

    fun btn3(view: View) {

        val MY_RESULT_CODE = 99
        var C = R.drawable.img4
        var i = Intent(this, Tela2::class.java)
        var b = Bundle()
        b.putInt("TEXTO", C)
        i.putExtras(b)
        startActivityForResult(i, 3)
    }

    fun btnverificar(view: View) {

        var Resposta1: String = resp1.text.toString();
        var Resposta2: String = resp2.text.toString();
        var Resposta3: String = resp3.text.toString();


        var A = "Paciente não é Daltônico"
        var B = "Paciente é Daltônico"


        if (Resposta1.equals("29") && Resposta2.equals("74") && Resposta3.equals("2")) {
            //Toast.makeText(this, A,   Toast.LENGTH_SHORT).show()
            result.setText(A)
        } else {
            result.setText(B)
        }

    }

    fun btnLimpar (view: View) {
        resp1.text.clear()
        resp2.text.clear()
        resp3.text.clear()
        result.text.clear()
        }

}

