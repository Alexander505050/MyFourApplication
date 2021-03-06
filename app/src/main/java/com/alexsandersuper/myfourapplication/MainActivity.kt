package com.alexsandersuper.myfourapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private const val HELLO_KEY = "Hello"
const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    lateinit var nextActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nextActivityButton = findViewById(R.id.center_BUTTON)

        nextActivityButton.setOnClickListener {
            val userActivityIntent: Intent = Intent(this, UserActivity::class.java)
            userActivityIntent.putExtra(HELLO_KEY, "Добро пожаловать")
            startActivity(userActivityIntent)
        }
        nextActivityButton = findViewById(R.id.button_browser)

        nextActivityButton.setOnClickListener {
            val googlelink = Uri.parse("https://google.com")
            val openBrowserIntent = Intent(Intent.ACTION_VIEW, googlelink)
            startActivity(openBrowserIntent)

        }
        val helloTextView: TextView = findViewById(R.id.text_GOOD)
        val newTextButton: Button = findViewById(R.id.button_help)
        newTextButton.setOnClickListener {
            helloTextView.text = "Нажмите на ENTRANCE"

        }

        Log.d(
            TAG, "Ты видел деву на скале\n" +
                    "В одежде белой над волнами"
        )
    }

    override fun onStart() {
        super.onStart()
        Log.d(
            TAG, "Когда, бушуя в бурной мгле,\n" +
                    "Играло море с берегами,"
        )
    }

    override fun onResume() {
        super.onResume()
        Log.d(
            TAG, "Когда луч молний озарял,\n" +
                    "Ее всечасно блеском алым,"
        )
    }

    override fun onPause() {
        super.onPause()
        Log.d(
            TAG, "И ветер бился и летал\n" +
                    "С ее летучим покрывалом?"
        )
    }

    override fun onStop() {
        super.onStop()
        Log.d(
            TAG, "Прекрасно море в бурной мгле\n" +
                    "И небо в блесках без лазури;"
        )
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(
            TAG, "Но верь мне: дева на скале"
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(
            TAG, "В одежде белой над волнами"
        )
    }


}
