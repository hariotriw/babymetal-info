package com.wowovan.babymetaldeath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_menu.*

class MainMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        btnMenuProfile.setOnClickListener {
            Toast.makeText(this, "Opening Profile", Toast.LENGTH_SHORT).show()
        }

        btnMenuMember.setOnClickListener {
            Toast.makeText(this, "Opening Member", Toast.LENGTH_SHORT).show()
            Intent(this, MemberMenuActivity::class.java).also{
                startActivity(it)
            }
        }

        btnMenuSongs.setOnClickListener {
            Toast.makeText(this, "Opening Songs", Toast.LENGTH_SHORT).show()
            Intent(this, AlbumMenuActivity::class.java).also{
                startActivity(it)
            }
        }

        btnMenuTour.setOnClickListener {
            Toast.makeText(this, "Opening Tour", Toast.LENGTH_SHORT).show()
            Intent(this, TourMenuActivity::class.java).also{
                startActivity(it)
            }
        }

        btnMenuExit.setOnClickListener {
            Toast.makeText(this, "Exit Aplikasi..", Toast.LENGTH_SHORT).show()
            finishAffinity()
        }

    }
}