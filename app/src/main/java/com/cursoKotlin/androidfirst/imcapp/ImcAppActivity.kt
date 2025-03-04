package com.cursoKotlin.androidfirst.imcapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cursoKotlin.androidfirst.R
import com.cursoKotlin.androidfirst.databinding.ActivityImcAppBinding

class ImcAppActivity : AppCompatActivity() {
    private lateinit var binding: ActivityImcAppBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_imc_app)

        // Inflar el layout usando View Binding
        binding = ActivityImcAppBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}