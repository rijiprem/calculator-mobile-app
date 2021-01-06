package com.riji.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum(view: View) {
        intent= Intent(this,AddActivity::class.java);
        startActivity(intent);
    }
    fun difference(view: View) {
        intent= Intent(this,SubtractActivity::class.java);
        startActivity(intent);
    }
    fun product(view: View) {
        intent= Intent(this,ProductActivity::class.java);
        startActivity(intent);
    }
    fun division(view: View) {
        intent= Intent(this,DivisionActivity::class.java);
        startActivity(intent);
    }
}