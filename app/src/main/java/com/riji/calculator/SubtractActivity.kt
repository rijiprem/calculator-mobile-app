package com.riji.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class SubtractActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subtract)
    }

    fun subtract(view: View) {
        var getFirstNumber=findViewById<EditText>(R.id.num1);
        var getSecondNumber=findViewById<EditText>(R.id.num2);
        var num1=getFirstNumber.text.toString();
        var num2=getSecondNumber.text.toString();
        var result :Double=num1.toDouble()-num2.toDouble();

        Toast.makeText(this,result.toString(), Toast.LENGTH_LONG).show();
    }
}