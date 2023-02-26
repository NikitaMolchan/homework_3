package com.example.dz_2

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz_2.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.WRITE.setOnClickListener {

            if (binding.name.text.length !== 0 && binding.surname.text.length !== 0 && binding.phone.text.length !== 0 && binding.age.text.length !== 0) {
                binding.WRITE.setBackgroundColor(Color.BLUE)
                binding.Name.text = binding.name.text
                binding.Surname.text = binding.surname.text
                binding.Phone.text = binding.phone.text
                binding.Age.text = binding.age.text
            }else{
                binding.WRITE.setBackgroundColor(Color.LTGRAY)
            }

            binding.CLEAR.setOnClickListener {
                binding.Name.text = ""
                binding.Surname.text = ""
                binding.Phone.text = ""
                binding.Age.text = ""
            }

        }


    }
}