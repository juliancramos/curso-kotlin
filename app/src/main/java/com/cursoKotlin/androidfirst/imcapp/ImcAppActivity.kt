package com.cursoKotlin.androidfirst.imcapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.cursoKotlin.androidfirst.R
import com.cursoKotlin.androidfirst.databinding.ActivityImcAppBinding
import java.text.DecimalFormat

class ImcAppActivity : AppCompatActivity() {

    private var isMaleSelected:Boolean = true
    private var currentWeight = 60
    private var currentAge = 20
    private var currentHeight = 120
    private lateinit var binding: ActivityImcAppBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflar el layout usando View Binding
        binding = ActivityImcAppBinding.inflate(layoutInflater)
        setContentView(binding.root)
        updateWeight()
        updateAge()
        initListeners()
    }

    private fun initListeners() {
        //Gender
        binding.viewMale.setOnClickListener { setGenderColor(true) }
        binding.viewFemale.setOnClickListener { setGenderColor(false) }

        //Height
        binding.rangeSliderHeight.addOnChangeListener { _, value, _ ->
            currentHeight = value.toInt()
            binding.heightText.text = "$currentHeight cm"
        }
        //Weight
        binding.btnMinus.setOnClickListener {
            currentWeight -=1
            updateWeight()
        }
        binding.btnPlus.setOnClickListener {
            currentWeight +=1
            updateWeight()
        }
        //Age
        binding.btnMinusAge.setOnClickListener {
            currentAge-=1
            updateAge()
        }
        binding.btnPlusAge.setOnClickListener {
            currentAge+=1
            updateAge()
        }
        //Calculate
        binding.btnCalculate.setOnClickListener {
            val result = calculateIMC()
            navigateToResultActivity(result)
        }
    }

    private fun navigateToResultActivity(result: Float) {
        val intent = Intent(this, ResultImcActivity::class.java)
        intent.putExtra("result", result)
        startActivity(intent)
    }

    private fun calculateIMC(): Float {
        val height = currentHeight.toFloat()/100
        val imcResult = currentWeight / (height * height)
        val df = DecimalFormat("#.##")
        val formattedResult = df.format(imcResult).toFloat()
        return formattedResult
    }

    private fun updateAge() {
        binding.textAge.text = currentAge.toString()
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