package com.example.uts_prak_mobile

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class FifthActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

        val textView: TextView = findViewById(R.id.name)
        val textView2: TextView = findViewById(R.id.store)

        val receivedData = intent.getStringExtra("value")
        val receivedData2 = intent.getStringExtra("selected_item")

        textView.text = receivedData
        textView2.text = receivedData2

        val nama = textView.text

        val checkBox: CheckBox = findViewById(R.id.checkBox)
        checkBox.setOnClickListener(View.OnClickListener {
            if (checkBox.isChecked()) {
                showToast("Terimakasih sudah memesan di toko kami " + nama + " pesanan papperoni pizza anda, diambil sendiri")
            } else {
                showToast("Terimakasih sudah memesan di toko kami " + nama + " pesanan papperoni pizza anda, dikirim fast devlivery")
            }
        })

    }
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}

