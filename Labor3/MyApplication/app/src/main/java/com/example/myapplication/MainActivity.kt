package com.example.myapplication

import android.content.Intent
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
        val startButton: Button = findViewById(R.id.signIn)
        val name: EditText = findViewById(R.id.nameInput)
        startButton.setOnClickListener {
            if (name.getText().toString().length > 0) {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("UserName", name.text.toString())
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"Insert your name",Toast.LENGTH_LONG).show()
            }
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