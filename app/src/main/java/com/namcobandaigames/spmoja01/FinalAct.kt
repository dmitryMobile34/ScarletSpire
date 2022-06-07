package com.namcobandaigames.spmoja01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FinalAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
    }

    fun again(view: View) {
        Intent(applicationContext, GIA::class.java).also { startActivity(it) }
        finish()
    }
}