package com.capstone.mathuto.watch

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.capstone.mathuto.R
import com.capstone.mathuto.databinding.ActivityWatchModuleEightBinding
import com.capstone.mathuto.databinding.ActivityWatchModuleFifteenBinding
import com.capstone.mathuto.databinding.ActivityWatchModuleSeventeenBinding

class ModuleFifteen : AppCompatActivity() {

    private lateinit var binding: ActivityWatchModuleFifteenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWatchModuleFifteenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.m15)
        binding.videoView.setVideoURI(videoUri)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(binding.videoView)
        binding.videoView.setMediaController(mediaController)

        binding.videoView.start()
    }
}