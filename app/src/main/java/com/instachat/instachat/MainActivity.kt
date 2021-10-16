package com.instachat.instachat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val isLoggedIn = false
        if(isLoggedIn) startActivity(Intent(this,HomeActivity::class.java))
        else startActivity(Intent(this,LoginActivity::class.java))
        finish()
    }
}