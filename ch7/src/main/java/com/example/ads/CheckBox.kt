package com.example.ads

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_check_box.*

class CheckBox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)


        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            println("haha"+isChecked)
            Log.d("d","thisis"+isChecked.toString())
        }

        checkBox.isChecked=false


    }
}
