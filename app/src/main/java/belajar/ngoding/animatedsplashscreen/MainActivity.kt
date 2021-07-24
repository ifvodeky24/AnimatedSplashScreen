package belajar.ngoding.animatedsplashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import androidx.core.os.postDelayed
import belajar.ngoding.animatedsplashscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val zoom = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)

        binding.image.startAnimation(zoom)

    }
}