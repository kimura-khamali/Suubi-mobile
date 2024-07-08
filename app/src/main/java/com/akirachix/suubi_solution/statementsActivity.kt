package com.akirachix.suubi_solution

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.suubi_solution.databinding.ActivityStatementsBinding

class statementsActivity : AppCompatActivity() {
    lateinit var binding: ActivityStatementsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityStatementsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.deposit.setOnClickListener {
            val intent = Intent(this, loans_section_Activity::class.java)
            startActivity(intent)
        }
    }
}