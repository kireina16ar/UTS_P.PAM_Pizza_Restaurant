package com.example.uts_prak_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.navigation.ui.AppBarConfiguration

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.list)
        val adapter = ArrayAdapter.createFromResource(this, R.array.store_label, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = this

        val inputData: EditText = findViewById(R.id.inputText1)
        val secondBut: Button = findViewById (R.id.secondBut)


        secondBut.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            val selectedSpinnerItem = spinner.selectedItem.toString()
            intent.putExtra("selected_item", selectedSpinnerItem)
            val send = inputData.text.toString()
            intent.putExtra("value", send)
            startActivity(intent)

        }


    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val text = parent?.getItemAtPosition(position).toString()
        Toast.makeText(parent?.context, text, Toast.LENGTH_SHORT).show()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}