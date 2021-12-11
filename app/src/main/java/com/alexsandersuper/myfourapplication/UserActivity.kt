package com.alexsandersuper.myfourapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

private const val  HELLO_KEY="Hello"

class UserActivity : AppCompatActivity() {
        lateinit var helloTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        helloTextView = findViewById(R.id.textSecond)
        val helloValue:String? = intent.extras?.getString(HELLO_KEY)
        helloTextView.text = helloValue
    }
}