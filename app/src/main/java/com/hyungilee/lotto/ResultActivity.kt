package com.hyungilee.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        Toast.makeText(applicationContext, "ResultActivity이다.",Toast.LENGTH_SHORT).show()
    }
}
