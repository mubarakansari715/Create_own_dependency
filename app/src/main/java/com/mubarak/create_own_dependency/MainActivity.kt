package com.mubarak.create_own_dependency

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mubarak.mycommonlibrary.extenstions.isEmailValid

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (isEmailValid("mubarak@gmail.com")) {
            Toast.makeText(this, "Valid Email", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this, "Not Valid Email", Toast.LENGTH_LONG).show()
        }
    }
}