package com.dwinuray.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById(R.id.button) as Button
        button.setOnClickListener({

            Toast.makeText(this@MainActivity, "Okei clicked", Toast.LENGTH_SHORT).show();
        })
    }
}
