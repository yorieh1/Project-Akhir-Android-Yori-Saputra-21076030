package com.example.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class DaftarActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        val btnClick : Button = findViewById(R.id.btn_DAFTAR)
        btnClick.setOnClickListener(this)


    }

    override fun onClick(v: View){

        if (v !=null){
            when(v.id){
                R.id.btn_DAFTAR -> {
                    val pindahIntent = Intent(this, LoginActivity::class.java)
                    startActivity((pindahIntent))
                }
            }
        }
    }

}