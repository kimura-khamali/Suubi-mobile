

package com.akirachix.suubi_solution

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.suubi_solution.databinding.ActivityLoginBinding

class loginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signUpTextView.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        binding.checkLogin.setOnClickListener {
            validateRegistration()
        }

    }

    private fun validateRegistration() {
        var formErr = false
        clearErrors()

        val userName = binding.sacco.text.toString()
        if (userName.isBlank()) {
            formErr = true
            binding.sacco.error = "Monthly Deduction is required"
        }

        val password = binding.etconPassword.text.toString()
        if (password.isBlank()) {
            formErr = true
            binding.etconPassword.error = "Password is required"
        }

        if (!formErr) {
            // Proceed with registration or login
            val intent = Intent(this, loans_section_Activity::class.java)
            startActivity(intent)
        }
    }

    private fun clearErrors() {
        binding.sacco.error = null
        binding.etconPassword.error = null
    }
}



//
//import android.annotation.SuppressLint
//import android.content.Intent
//import android.os.Bundle
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//import com.akirachix.suubi_solution.databinding.ActivityLoginBinding
//
//class loginActivity : AppCompatActivity() {
//    lateinit var binding: ActivityLoginBinding
//    @SuppressLint("SuspiciousIndentation")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
////        enableEdgeToEdge()
//        binding= ActivityLoginBinding.inflate(layoutInflater)
//        setContentView(binding.root)
////
////        binding.log.setOnClickListener{
////
////                finish()
////            }
//
//            binding.checkLogin.setOnClickListener {
//                val intent = Intent(this, loans_section_Activity::class.java)
//                startActivity(intent)
//            }
//        binding.sacco.setOnClickListener {
//            validateRegistration()
//        }
//        }
//
//
//
//
//
//fun validateRegistration() {
//    var formErr = false
////        clearErrors()
//    val monthlyDeduction = binding.sacco.text.toString()
//    if (monthlyDeduction.isBlank()) {
//        formErr = true
//        binding.sacco.error = "User Name is required"
//    }
//
//    val password = binding.tilcoPassword.toString()
//    if (password.isBlank()) {
//        formErr = true
//        binding.etconPassword.error = "Last name is required"
//    }
//}
//fun clearError() {
//
//}
//}