package com.cursoKotlin.androidfirst.imcapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.cursoKotlin.androidfirst.R
import com.cursoKotlin.androidfirst.databinding.ActivityImcAppBinding

class ImcAppActivity : AppCompatActivity() {

    private var isMaleSelected:Boolean = true
    private var currentWeight = 60
    private lateinit var binding: ActivityImcAppBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflar el layout usando View Binding
        binding = ActivityImcAppBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()
    }

    private fun initListeners() {
        binding.viewMale.setOnClickListener { setGenderColor(true) }
        binding.viewFemale.setOnClickListener { setGenderColor(false) }
        binding.rangeSliderHeight.addOnChangeListener { _, value, _ ->
            var valueFormat = String.format("%.0f", value)
            binding.heightText.text = "$valueFormat cm"
        }
        updateWeight()
        binding.btnMinus.setOnClickListener {
            currentWeight -=1
            updateWeight()
        }
        binding.btnPlus.setOnClickListener {
            currentWeight +=1
            updateWeight()
        }
    }

    private fun updateWeight() {
        binding.textWeight.text = currentWeight.toString()
    }

    private fun setGenderColor(isMale:Boolean){
        isMaleSelected = isMale
        binding.viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        binding.viewFemale.setCardBackgroundColor(getBackgroundColor(!isMaleSelected))
    }

    private fun getBackgroundColor(isSelected:Boolean) =
        ContextCompat.getColor(this,
            if (isSelected) R.color.background_component_selected
            else R.color.background_component)

}