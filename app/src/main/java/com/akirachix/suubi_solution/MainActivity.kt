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
        binding.btnNext.setOnClickListener {
            val intent = Intent(this,homeActivity::class.java)
        }
    }
}
//lateinit var binding:ActivityMainBinding
//override fun onCreate(savedInstanceState: Bundle?) {
//    binding=ActivityMainBinding.inflate(layoutInflater)
//    super.onCreate(savedInstanceState)
//
//    setContentView(binding.root)
//    binding.btnNext.setOnClickListener {
//        val intent = Intent(this, second_bird::class.java)
//        startActivity(intent)
//    }
//
//}
//}

//
//binding.textView2
//.setOnClickListener {
//    val intent = Intent(this, login::class.java)
//    startActivity(intent)
//}
//binding.btnNext.setOnClickListener {
//    validateRegistration()
//}
//
//}
//
//fun validateRegistration() {
//    var formErr = false
//    val firstName = binding.etFirstName.text.toString()
//    if (firstName.isBlank()) {
//        formErr = true
//        binding.tilFirstName.error = "First name is required"
//    }
//
//    val lastName = binding.etLastName.text.toString()
//    if (lastName.isBlank()) {
//        formErr = true
//        binding.tilLastName.error = "Last name is required"
//    }
//    val email = binding.etEmail.text.toString()
//    if (email.isBlank()) {
//        formErr = true
//        binding.tilEmail.error = "Email  is required"
//    }
//    val codehiveid = binding.etCodehiveId.text.toString()
//    if (codehiveid.isBlank()) {
//        formErr = true
//        binding.tilCodehiveId.error = "Codehive ID is required"
//    }
//    val username = binding.etUsername.text.toString()
//    if (username.isBlank()) {
//        formErr = true
//        binding.tilUsername.error = "Username is required"
//    }
//    val password = binding.etConfirmPassword.text.toString()
//    if (password.isBlank()) {
//        formErr = true
//        binding.tilPassword.error = "Password is required"
//    }
//    val passwordConf = binding.etConfirmationPassword.text.toString()
//    if (passwordConf.isBlank()) {
//        formErr = true
//        binding.tilConfirmPassword.error = "Password confirmation is required"
//    }
//    if(password!=passwordConf){
//        formErr=true
//        binding.tilConfirmPassword.error="Passwords don't match"
//    }
//    if(!formErr){
//        //proceed to registration
//    }
//
//
//}
//fun clearErrors(){
//    binding.tilFirstName.error=null
//    binding.tilLastName.error=null
//    binding.tilEmail.error=null
//    binding.tilCodehiveId.error=null
//    binding.tilPassword.error=null
//    binding.tilConfirmPassword.error=null
//    binding.tilUsername.error=null
//
//}
