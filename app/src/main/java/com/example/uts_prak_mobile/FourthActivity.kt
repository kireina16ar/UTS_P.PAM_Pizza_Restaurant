package com.example.uts_prak_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val receivedData = intent.getStringExtra("value")
        val receivedData2 = intent.getStringExtra("selected_item")

        val nextBut: Button = findViewById (R.id.nextBut)
        nextBut.setOnClickListener{
            val intent = Intent(this, FifthActivity::class.java)
            intent.putExtra("value", receivedData)
            intent.putExtra("selected_item", receivedData2)
            startActivity(intent)
        }

        val backBut: Button = findViewById (R.id.backBut)
        backBut.setOnClickListener{
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("value", receivedData)
            startActivity(intent)
        }
    }
}