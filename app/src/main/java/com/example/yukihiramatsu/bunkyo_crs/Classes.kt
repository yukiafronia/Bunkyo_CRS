package com.example.yukihiramatsu.bunkyo_crs

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Classes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_classes)

        fun changeActivity(view: View){
            startActivity(Intent(this, Information::class.java))
        }
    }
}