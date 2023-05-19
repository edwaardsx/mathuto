package com.capstone.mathuto.watch

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.capstone.mathuto.R
import com.capstone.mathuto.databinding.ActivityWatchModuleEightBinding

class ModuleEight : AppCompatActivity() {

    private lateinit var binding: ActivityWatchModuleEightBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWatchModuleEightBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.m8)
        binding.videoView.setVideoURI(videoUri)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(binding.videoView)
        binding.videoView.setMediaController(mediaController)

        binding.videoView.start()
    }
}