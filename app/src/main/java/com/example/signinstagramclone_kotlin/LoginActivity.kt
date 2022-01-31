package com.example.signinstagramclone_kotlin

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {
    private lateinit var emailLog: EditText
    private lateinit var passwordLog: EditText
    private lateinit var btnLogin: Button
    private lateinit var sinUpLogin: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        emailLog = findViewById(R.id.email_login)
        passwordLog = findViewById(R.id.password_login)
        btnLogin = findViewById(R.id.btn_login)
        sinUpLogin = findViewById(R.id.sign_up_login)
        btnLogin.setOnClickListener(View.OnClickListener { view: View? ->
            if (TextUtils.isEmpty(emailLog.text.toString()) || TextUtils.isEmpty(passwordLog.text.toString())) {
                val snackbar = Snackbar.make(
                    view!!,
                    "Please enter email and password!",
                    Snackbar.LENGTH_LONG
                )
                snackbar.show()
            } else {
                openHomeActivity()
                finish()
            }
        })
        sinUpLogin.setOnClickListener(View.OnClickListener { view: View? -> openRegActivity() })
    }

    private fun openHomeActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun openRegActivity() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
}