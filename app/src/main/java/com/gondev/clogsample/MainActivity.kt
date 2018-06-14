package com.gondev.clogsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gondev.clog.CLog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CLog.d("activity created!")

        btnClick.setOnClickListener { CLog.i("button clicked") }

    }
}
