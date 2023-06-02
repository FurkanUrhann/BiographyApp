package com.works

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class GaleriActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeri)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Galeri"

        val images: List<String> = listOf(
           "https://picsum.photos/id/237/200/300",
           "https://picsum.photos/id/251/200/300",
           "https://picsum.photos/id/292/200/300",
           "https://picsum.photos/id/249/200/300",
           "https://picsum.photos/id/282/200/300",
           "https://picsum.photos/id/211/200/300",
           "https://picsum.photos/id/267/200/300",

        )

        val recyclerView: RecyclerView = findViewById(R.id.gallery_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = GalleryAdapter(this, images)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private class GalleryAdapter(private val context: AppCompatActivity, private val images: List<String>) :
        RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {

        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val imageView: ImageView = view.findViewById(R.id.gallery_image_view)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.galeri_item, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            Glide.with(context).load(images[position]).into(holder.imageView)
        }

        override fun getItemCount(): Int {
            return images.size
        }
    }
}