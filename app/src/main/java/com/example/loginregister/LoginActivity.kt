package com.example.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnClick: Button = findViewById(R.id.btn_LOGIN);
        btnClick.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v !=null) {
            when (v.id) {
                R.id.btn_LOGIN -> {
                    val pindahIntent = Intent(this, DaftarActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}