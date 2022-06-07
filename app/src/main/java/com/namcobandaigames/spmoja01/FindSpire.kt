package com.namcobandaigames.spmoja01
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_find_spire.*

class FindSpire : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_spire)

        finishBtn.setOnClickListener {
            Intent(applicationContext, FinalAct::class.java).also { startActivity(it) }
            finish()
        }

        fog1.setOnClickListener {
            fog1.isVisible = false
            false1.isVisible = true
            txtCondition.text = "Wrong Choice"
        }
        fog2.setOnClickListener {
            fog2.isVisible = false
            false2.isVisible = true
            txtCondition.text = "Wrong Choice"
        }
        fog3.setOnClickListener {
            fog3.isVisible = false
            rightway.isVisible = true
            txtCondition.text = "Congratulations! This is the right choice!"
            finishBtn.isVisible = true
        }

        fog4.setOnClickListener {
            fog4.isVisible = false
            false3.isVisible = true
            txtCondition.text = "Wrong Choice"
        }

        fog5.setOnClickListener {
            fog5.isVisible = false
            false4.isVisible = true
            txtCondition.text = "Wrong Choice"
        }

        fog6.setOnClickListener {
            fog6.isVisible = false
            false5.isVisible = true
            txtCondition.text = "Wrong Choice"
        }

    }
}