package com.app.recycle_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailDemonslayerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_demonslayer)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val demonslayer = intent.getParcelableExtra<Demonslayer>(MainActivity.INTENT_PARCELABLE)

        val imgDemonslayer = findViewById<ImageView>(R.id.img_item_photo)
        val nameDemonslayer = findViewById<TextView>(R.id.tv_item_name)
        val descDemonslayer = findViewById<TextView>(R.id.tv_item_description)

        imgDemonslayer.setImageResource(demonslayer?.imgDemonslayer!!)
        nameDemonslayer.text = demonslayer.nameDemonslayer
        descDemonslayer.text = demonslayer.descDemonslayer
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}