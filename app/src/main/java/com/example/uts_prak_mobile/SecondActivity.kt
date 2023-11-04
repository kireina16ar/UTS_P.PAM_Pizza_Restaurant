package com.example.uts_prak_mobile

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView: TextView = findViewById(R.id.text2)
        val textView2: TextView = findViewById(R.id.text3)

        val getView = getIntent().getExtras()?.getString("value");
        val getView2 = getIntent().getExtras()?.getString("selected_item");
        textView.setText(getView)
        textView2.setText(getView2)

        val thirdBut: Button = findViewById (R.id.thirdBut)
        thirdBut.setOnClickListener{
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("value", getView)
            intent.putExtra("selected_item", getView2)
            startActivity(intent)
        }
    }
}