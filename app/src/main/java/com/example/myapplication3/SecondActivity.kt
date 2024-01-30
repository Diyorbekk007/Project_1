package com.example.myapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.example.myapplication3.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private var _binding: ActivitySecondBinding? = null
    private val binding: ActivitySecondBinding get() = _binding!!
    private var imageWord = "animal"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val text = intent.getStringExtra("username")
        binding.toolbar.setNavigationOnClickListener {
            finish()
            //hello world
        }
        loadImageText()
        binding.toolbar.title = text ?: "Empty"
    }

    private fun loadImageText() {
        val size = imageWord.length
        binding.name0.isVisible = size > 0
        binding.name1.isVisible = size > 1
        binding.name2.isVisible = size > 2
        binding.name3.isVisible = size > 3
        binding.name4.isVisible = size > 4
        binding.name5.isVisible = size > 5
        binding.name6.isVisible = size > 6
        binding.name7.isVisible = size > 7

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}