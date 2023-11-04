package com.example.uts_prak_mobile

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val textView: TextView = findViewById(R.id.text23)
        val receivedData = intent.getStringExtra("value")
        textView.text = receivedData

        val receivedData2 = intent.getStringExtra("selected_item")

        val imageButton = findViewById<ImageButton>(R.id.imgBut)

        imageButton.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            intent.putExtra("value", receivedData)
            intent.putExtra("selected_item", receivedData2)
            startActivity(intent)
        }
    }
}