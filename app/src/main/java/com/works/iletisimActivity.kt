package com.works

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class iletisimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iletisim)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "İletişim"

        val nameTextView: TextView = findViewById(R.id.name_text)
        val phoneTextView: TextView = findViewById(R.id.phone_text)
        val emailTextView: TextView = findViewById(R.id.email_text)

        nameTextView.text = "Furkan Urhan"
        phoneTextView.text = "05079994736"
        emailTextView.text = "furkanurhan@gmail.com"
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}