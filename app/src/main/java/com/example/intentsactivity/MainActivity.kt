package com.example.intentsactivity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.intentsactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        ArrayAdapter.createFromResource(this, R.array.cursos_array, android.R.layout.simple_spinner_item)
            .also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.spinner.adapter = adapter
        }

        binding.goButton.setOnClickListener{goToAlumnesInfo()}
        binding.addButton.setOnClickListener{addAlumne()}
    }

    fun goToAlumnesInfo() {
        val intent = Intent(applicationContext, AlumnesInfo::class.java)
        val str = binding.spinner.selectedItem.toString()
        intent.putExtra("curs", str)
        startActivity(intent)
    }

    fun addAlumne() {
        if (binding.textFieldNameText.text.toString() == ""
            || binding.textFieldAgeText.text.toString() == ""
            || binding.spinner.selectedItem.toString() == "") {
            return
        }
        val alumne = Alumne(binding.textFieldNameText.text.toString(), binding.textFieldAgeText.text.toString().toInt(), binding.spinner.selectedItem.toString())
        Datasource.instace.addAlumneToArray(alumne)
        binding.textFieldNameText.setText("")
        binding.textFieldAgeText.setText("")
    }
}