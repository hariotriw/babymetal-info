package com.wowovan.babymetaldeath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_songs_menu_unused.*

class SongsMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_songs_menu_unused)

        btnAlbumKembali.setOnClickListener {
            Toast.makeText(this, "menutup halaman album ...", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}