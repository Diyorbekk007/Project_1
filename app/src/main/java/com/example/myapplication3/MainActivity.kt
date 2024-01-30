package com.example.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import com.example.myapplication3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = _binding!!
    private var isSuccess = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        binding.passwordEdit.addTextChangedListener() {
            binding.passwordEditLayout.helperText = "Enter your password"
        }
        binding.userNameEdit.addTextChangedListener {
            binding.userNameEditLayout.helperText = "Enter Username"
        }
        binding.continueButton.setOnClickListener {
            val username = binding.userNameEdit.text.toString()

            val password = binding.passwordEdit.text.toString()
            binding.acceptLayoutCheckbox.visibility = View.VISIBLE

            Log.e("TESTS","${username} $password")


            if (isCheckUsername(username) && isCheckPassword(password)) {

                Log.e("TESTS","YES1")

                if (isSuccess) {
                    Log.e("TESTS","YES2")

                    if (binding.acceptCheckbox.isChecked) {
                        Log.e("TESTS","YES3")

                        Toast.makeText(this, "Success passed", Toast.LENGTH_LONG).show()
                        val intent = Intent(this, SecondActivity::class.java)
                        intent.putExtra("username", binding.userNameEdit.text.toString())
                        intent.putExtra("password", binding.passwordEdit.text.toString())
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    binding.acceptCheckbox.isVisible = true
                    binding.continueButton.text = "Sign up"
                    isSuccess = true
                }
            } else if (!isCheckUsername(username)) {
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show()

                binding.userNameEditLayout.helperText = "Usernameda kamchilik bor"
                isSuccess = false

            } else {
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show()

                binding.passwordEditLayout.helperText = "Parolda kamchilik bor"
                isSuccess = false
            }
        }
    }

    private fun isCheckUsername(userName: String): Boolean {

        var a=true

        if (userName.isBlank())
            a= false

        if (userName.length !in 3..20)
            a= false

        if (!userName.matches(Regex(".*[A-Z].*")))
            a= false

        if (!userName.matches(Regex(".*[a-z].*")))
            a=false
        return a
    }

    private fun isCheckPassword(passWord: String): Boolean {

        var a=true

        if (passWord.isBlank())
            a= false

        if (passWord.length < 8)
            a= false

        if (!passWord.matches(Regex(".*[A-Z].*")))
            a= false

        if (!passWord.matches(Regex(".*[a-z].*")))
            a= false

        if (!passWord.matches(Regex(".*[0-9].*")))
            a= false

        return a
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}