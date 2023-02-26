package com.example.dz_2

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {

            if (binding.name.text.length !== 0 && binding.surname.text.length !== 0 && binding.phone.text.length !== 0 && binding.age.text.length !== 0) {
                var list: MutableList<Any> = mutableListOf()
                list.add(binding.name.text)
                list.add(binding.surname.text)
                list.add(binding.phone.text)
                list.add(binding.age.text)
                binding.allinfo.text = list.toString()
                binding.btn1.setBackgroundColor(Color.BLUE)
            }else{
                binding.btn1.setBackgroundColor(Color.LTGRAY)
            }

        }

    }
}
