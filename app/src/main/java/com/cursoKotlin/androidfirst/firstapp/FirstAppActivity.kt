package com.cursoKotlin.androidfirst.firstapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
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

        binding.button.setOnClickListener {
            val name = binding.name.text.toString()
            if (name.isNotEmpty()){
                //Para mensaje temporal en la parte de abajo
                Toast.makeText(baseContext, "Hello: $name", Toast.LENGTH_LONG).show()

                val intent = Intent(baseContext, ResultActivity::class.java)
                intent.putExtra("name" , name)
                startActivity(intent)
            }else{
                Toast.makeText(baseContext, "Escribe tu nombre", Toast.LENGTH_LONG).show()
            }

        }


//        Para adaptar padding
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}