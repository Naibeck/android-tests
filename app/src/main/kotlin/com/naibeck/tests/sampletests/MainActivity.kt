package com.naibeck.tests.sampletests

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sampleText = findViewById<TextView>(R.id.sampleTextView)
        sampleText.setOnClickListener {
            sampleText.text = getString(R.string.after_clicked_message)
        }
    }
}
