package com.william.ijkplayerlearn

import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.william.ijkvideoview.widget.media.IjkVideoView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val url=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView = IjkVideoView(this)
        fl_video_container.addView(videoView)

        videoView.setVideoURI(Uri.parse(url))
    }
}
