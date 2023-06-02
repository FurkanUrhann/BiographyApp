package com.works

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aboutButton: Button = findViewById(R.id.about_button)
        aboutButton.setOnClickListener {
            startActivity(Intent(this, HakkimdaActivity::class.java))
        }

        val galleryButton: Button = findViewById(R.id.gallery_button)
        galleryButton.setOnClickListener {
            val intent = Intent(this, GaleriActivity::class.java )
            startActivity(intent)
        }

        val contactButton: Button = findViewById(R.id.contact_button)
        contactButton.setOnClickListener {
            startActivity(Intent(this, iletisimActivity::class.java))
        }

        val blogButton: Button = findViewById(R.id.blog_button)
        blogButton.setOnClickListener {
           val intent = Intent(this, BlogActivity::class.java )
            startActivity(intent)
        }
    }
}