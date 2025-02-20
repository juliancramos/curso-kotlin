package com.cursoKotlin.androidfirst.firstapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cursoKotlin.androidfirst.R
import com.cursoKotlin.androidfirst.databinding.ActivityFirstAppBinding

class FirstAppActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFirstAppBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_first_app)

        // Inflar el layout usando View Binding
        binding = ActivityFirstAppBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        Para adaptar padding
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}