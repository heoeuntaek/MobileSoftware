package com.example.ch10

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "Orientation"

class LifeCycle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
        Log.d(TAG, "onCreate() 호출")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() 호출")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart() 호출")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() 호출")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() 호출")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() 호출")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() 호출")
    }
}

