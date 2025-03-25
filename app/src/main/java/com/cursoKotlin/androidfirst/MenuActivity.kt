package com.cursoKotlin.androidfirst

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.cursoKotlin.androidfirst.databinding.ActivityMenuBinding
import com.cursoKotlin.androidfirst.firstapp.FirstAppActivity
import com.cursoKotlin.androidfirst.imcapp.ImcAppActivity
import com.cursoKotlin.androidfirst.todoapp.ToDoAppActivity

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        // Inflar el layout usando View Binding
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSaludoApp.setOnClickListener { navigateToSaludoApp() }

        binding.buttonIMCApp.setOnClickListener { navigateToImcApp() }

        binding.buttonToDoApp.setOnClickListener { navigateToToDoApp() }
    }

    private fun navigateToToDoApp() {
        val intent = Intent(this, ToDoAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludoApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp(){
        val intent = Intent(this, ImcAppActivity::class.java)
        startActivity(intent)
    }
}