package com.dwinuray.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // var button = findViewById(R.id.button) as Button
        button.setOnClickListener({



            val name = input.text.toString()

            if ( name == null || name.trim() == "" )
                Toast.makeText(this@MainActivity, "Inputan tidak boleh kosong", Toast.LENGTH_SHORT).show()
            else {
                textView.setText( name )

                // change image
                var imgRes = resources.getIdentifier( name, "drawable", packageName )
                img.setImageResource( imgRes )
            }
        })
    }
}
