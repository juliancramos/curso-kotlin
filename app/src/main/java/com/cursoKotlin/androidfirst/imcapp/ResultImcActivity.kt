package com.cursoKotlin.androidfirst.imcapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cursoKotlin.androidfirst.databinding.ActivityResultImcBinding

class ResultImcActivity : AppCompatActivity() {
    private lateinit var binding : ActivityResultImcBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultImcBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val result = intent.getFloatExtra("result", 0f)
        initUI(result)
        binding.buttonRecalcular.setOnClickListener { onBackPressedDispatcher.onBackPressed() }
    }

    private fun initUI(result: Float) {
        binding.textViewResult.text = result.toString()
        when(result){
            in 0.0 .. 18.50 ->{
                binding.textViewTitle.text = "Bajo peso"
                binding.textViewDescription.text = "Estás por debajo de lo óptimo para tu peso y altura"
            }
            in 18.51 .. 24.99 ->{
                binding.textViewTitle.text = "Normal"
                binding.textViewDescription.text = "Estás en lo óptimo  para tu peso y altura"
            }
            in 25.0 .. 29.99 ->{
                binding.textViewTitle.text = "Sobrepeso"
                binding.textViewDescription.text = "Estás por encima de lo óptimo  para tu peso y altura"
            }
            in 30.00 .. 99.99 ->{
                binding.textViewTitle.text = "Obesidad"
                binding.textViewDescription.text = "Estás MUY por encima de lo óptimo  para tu peso y altura"
            }
            else ->{
                binding.textViewTitle.text = "Error"
                binding.textViewResult.text = "Error"
                binding.textViewDescription.text = "Error"
            }
        }
    }
}