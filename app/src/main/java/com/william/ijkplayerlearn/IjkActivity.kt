package com.william.ijkplayerlearn

import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ViewGroup
import com.blankj.utilcode.util.LogUtils
import com.william.ijkvideoview.widget.media.IjkVideoView
import kotlinx.android.synthetic.main.activity_main.*

class IjkActivity : AppCompatActivity() {

    private val url = rtmp

    private lateinit var videoView: IjkVideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        videoView = IjkVideoView(this)
        fl_video_container.addView(
            videoView,
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )

        videoView.setOnErrorListener { iMediaPlayer, i, i2 ->
            LogUtils.e("onError i=$i, i2=$i2")
            return@setOnErrorListener false
        }
        videoView.setOnPreparedListener {
            LogUtils.d("onPrepared")
        }
        videoView.setOnInfoListener { iMediaPlayer, i, i2 ->
            LogUtils.d("onInfo i=$i, $i2")
            return@setOnInfoListener false
        }

        videoView.setVideoURI(Uri.parse(url))
        videoView.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        videoView.release(true)
    }
}
