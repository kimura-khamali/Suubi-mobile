package com.akirachix.suubi_solution

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.suubi_solution.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        binding.suubitext.setOnClickListener {
            val intent = Intent(this,loansActivity::class.java)
            startActivity(intent)
        }
        binding.suubilogo.setOnClickListener {
            val intent = Intent(this,loansActivity::class.java)
            startActivity(intent)
        }
    }
}

