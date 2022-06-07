package com.namcobandaigames.spmoja01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class GIA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gia)

    }

    fun moveToQuest(view: View) {
        Intent(applicationContext, FindSpire::class.java).also { startActivity(it) }
        finish()
    }
}