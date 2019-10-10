package com.bindworks.glukolyzer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.TextView


class RandomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)
        showRandomNumber()
    }

    fun showRandomNumber() {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        val rand = Random()
        var n = rand.nextInt(count)
        n += 1

        val showCountTextView = findViewById<TextView>(R.id.random_textView)
        showCountTextView.text = n.toString()

        findViewById<TextView>(R.id.header_textView).text = getString(R.string.random_header, count)
    }
    companion object {
        const val TOTAL_COUNT = "total_count"
    }
}
