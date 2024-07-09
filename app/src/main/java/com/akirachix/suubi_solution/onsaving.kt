package com.akirachix.suubi_solution

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.suubi_solution.databinding.ActivityOnsavingBinding

class onsaving : AppCompatActivity() {
    lateinit var binding: ActivityOnsavingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=ActivityOnsavingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.setupTitle.setOnClickListener{
            val intent = Intent(this, savingcheck::class.java)
            startActivity(intent)
        }
    }
}