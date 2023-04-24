package com.example.bottomsheet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BottomSheetBehavior.from(findViewById(R.id.sheet)).apply {
            peekHeight = 200
            this.state= BottomSheetBehavior.STATE_COLLAPSED
        }
        findViewById<Button>(R.id.button).setOnClickListener {
            val intent=Intent(this,BottomSheetAdapterActivity::class.java)
            startActivity(intent)
        }
    }
}