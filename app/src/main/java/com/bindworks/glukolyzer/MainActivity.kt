package com.bindworks.glukolyzer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View) {
        val showCountTextView = findViewById<TextView>(R.id.textView)
        var count: Int = getCount(showCountTextView)
        count++
        showCountTextView.text = count.toString()
    }

    fun randomMe(view: View) {
        val randomIntent = Intent(this, RandomActivity::class.java)
        randomIntent.putExtra(RandomActivity.TOTAL_COUNT, getCount(findViewById(R.id.textView)))
        startActivity(randomIntent)
    }

    private fun getCount(showCountTextView: TextView): Int {
        val countString = showCountTextView.text.toString()
        return Integer.parseInt(countString)
    }
}
