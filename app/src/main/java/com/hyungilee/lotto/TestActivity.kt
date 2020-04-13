package com.hyungilee.lotto

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        button1.setOnClickListener {
            val intent = Intent(this@TestActivity, MainActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            startActivity(Intent(this@TestActivity, ConstellationActivity::class.java))
        }

        button3.setOnClickListener {
            startActivity(Intent(this@TestActivity, NameActivity::class.java))
        }

        button4.setOnClickListener {
            startActivity(Intent(this@TestActivity, ResultActivity::class.java))
        }

    }

//    fun goConstellation(view: View){
//        // ConstellationActivity로 화면전환을 하는 코드
//        val intent = Intent(this@TestActivity, ConstellationActivity::class.java)
//        startActivity(intent)
//    }

    fun callWeb(view: View){
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"))
        startActivity(intent)
    }
}
