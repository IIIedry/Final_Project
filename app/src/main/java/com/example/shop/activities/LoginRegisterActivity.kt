package com.example.shop.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shop.R
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp

@AndroidEntryPoint
class LoginRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actitivty_login_register)
    }
}