package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val TAG :String=javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"onCreate() called!")

        val startButton: Button = findViewById(R.id.start)
        val name: EditText = findViewById(R.id.nameInput);
        startButton.setOnClickListener {
            Log.d(TAG, "button clicked!")
            Log.d(TAG,name.getText().toString())
            Toast.makeText(this,"clicked",Toast.LENGTH_LONG).show()
        }
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Pause!")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Stoped!")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Started!")
    }
}