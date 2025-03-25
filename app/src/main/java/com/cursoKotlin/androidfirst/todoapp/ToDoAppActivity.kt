package com.cursoKotlin.androidfirst.todoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cursoKotlin.androidfirst.databinding.ActivityToDoAppBinding

class ToDoAppActivity : AppCompatActivity() {
    private lateinit var binding: ActivityToDoAppBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToDoAppBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}