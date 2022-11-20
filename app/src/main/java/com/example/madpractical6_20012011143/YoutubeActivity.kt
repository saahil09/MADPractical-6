package com.example.madpractical6_20012011143

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import com.example.madpractical6_20012011143.databinding.ActivityMainBinding
import com.example.madpractical6_20012011143.databinding.ActivityYoutubeBinding

class YoutubeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityYoutubeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYoutubeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initYoutubeVideo()
        binding.backButton.setOnClickListener {
            Intent(this@YoutubeActivity,MainActivity::class.java).apply {
                startActivity(this)
            }
        }
    }

    private val youtubeID = "Qw4w9WgXcQ"
    private fun initYoutubeVideo(){
        val webSettings: WebSettings = binding.myWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        binding.myWebView.loadUrl("https://youtu.be/dQw4w9WgXcQ")
    }
}