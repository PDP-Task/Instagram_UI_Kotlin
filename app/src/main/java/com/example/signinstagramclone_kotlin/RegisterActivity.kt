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

class RegisterActivity : AppCompatActivity() {
    private lateinit var fullNameReg: EditText
    private lateinit var emailReg: EditText
    private lateinit var passwordReg: EditText
    private lateinit var confirmReg: EditText
    private lateinit var btnReg: Button
    private lateinit var textViewReg: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        fullNameReg = findViewById(R.id.full_name_reg)
        emailReg = findViewById(R.id.email_reg)
        passwordReg = findViewById(R.id.password_reg)
        confirmReg = findViewById(R.id.confirm_pass_reg)
        btnReg = findViewById(R.id.btn_reg)
        textViewReg = findViewById(R.id.sign_in_reg)
        btnReg.setOnClickListener(View.OnClickListener { view: View? ->
            if (TextUtils.isEmpty(fullNameReg.getText()) || TextUtils.isEmpty(emailReg.getText())
                || TextUtils.isEmpty(passwordReg.getText()) || TextUtils.isEmpty(confirmReg.getText())
            ) {
                val snackbar = Snackbar.make(
                    view!!,
                    "Please enter your info correctly!",
                    Snackbar.LENGTH_LONG
                )
                snackbar.show()
            } else {
                openHomeActivity()
                finish()
            }
        })
    }

    private fun openHomeActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}