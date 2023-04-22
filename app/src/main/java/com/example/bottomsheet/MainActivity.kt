package com.example.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BottomSheetBehavior.from(findViewById(R.id.sheet)).apply {
            peekHeight = 200
            this.state= BottomSheetBehavior.STATE_COLLAPSED
        }
    }
}