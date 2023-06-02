package com.works

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class HakkimdaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hakkimda)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Hakkımda"
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}