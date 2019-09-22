package com.william.ijkplayerlearn

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.blankj.utilcode.util.LogUtils
import kotlinx.android.synthetic.main.activity_launch.*

/**
 * date: 2019/9/22 0022
 * @author hwj
 * description 描述一下方法的作用
 */
class LaunchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        btn_go_ijk.setOnClickListener {
            startActivity(Intent(this, IjkActivity::class.java))
            LogUtils.d("btn_go_ijk setListener")
        }

        btn_go_media.setOnClickListener {
            startActivity(
                Intent(
                    this, AndroidMediaPlayerActivity::class.java
                )
            )
            LogUtils.d("btn_go_ijk setListener")
        }

        LogUtils.d(btn_go_ijk.isShown)    }
}