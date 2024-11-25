package com.example.intentsactivity

import android.content.Intent
import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.intentsactivity.databinding.ActivityAlumnesInfoBinding
import com.example.intentsactivity.databinding.ActivityMainBinding

class AlumnesInfo : AppCompatActivity() {

    lateinit var binding: ActivityAlumnesInfoBinding
    lateinit var adapter: AlumneAdapter
    lateinit var llistatAlumnes: List<Alumne>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_alumnes_info)


        llistatAlumnes = Datasource.instace.loadAlumnesArray().filter { it.curs == intent.getStringExtra("curs") }

        adapter = AlumneAdapter(llistatAlumnes)

        binding.recyclerViewAlumnes.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewAlumnes.adapter = adapter

        binding.goMainButton.setOnClickListener{goToMainActivity()}
    }

    fun goToMainActivity() {
        finish()
    }
}