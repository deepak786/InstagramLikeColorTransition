package com.sample.instagramlikecolortransition.kotlin

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    private lateinit var anim: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // reference to parent layout
        val container = findViewById<LinearLayout>(R.id.container)

        // initialize the animation
        anim = container.background as AnimationDrawable
        anim?.setEnterFadeDuration(6000)
        anim?.setExitFadeDuration(2000)
    }

    override fun onResume() {
        super.onResume()
        // start the animation
        if (!anim?.isRunning())
            anim.start()
    }

    override fun onPause() {
        super.onPause()
        // stop the animation
        if (anim?.isRunning())
            anim.stop()
    }

}
