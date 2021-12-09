package com.alexsandersuper.myfourapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Ты видел деву на скале\n" +
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