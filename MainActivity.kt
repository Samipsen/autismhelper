package com.example.autismhelper

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.autismhelper.databinding.ActivityHomeBinding // Import the binding class

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding // Declare a binding variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater) // Inflate the binding
        setContentView(binding.root) // Set the root view to the binding root

        // Set up click listeners for each button using the binding
        binding.languageGameButton.setOnClickListener {
            startActivity(Intent(this, LanguageGameActivity::class.java))
        }

        binding.outlinesGameButton.setOnClickListener {
            startActivity(Intent(this, OutlinesGameActivity::class.java))
        }

        binding.patchesGameButton.setOnClickListener {
            startActivity(Intent(this, PatchesGameActivity::class.java))
        }
    }
}
