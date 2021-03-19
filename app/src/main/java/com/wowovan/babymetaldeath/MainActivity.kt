package com.wowovan.babymetaldeath


import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*btnEnterBabymetal.setOnClickListener {
            Toast.makeText(this, "opening main menu..", Toast.LENGTH_SHORT).show()
            Intent(this, MainMenuActivity::class.java).also {
                startActivity(it)
            }
        }*/

        btnEnterBabymetal.setOnClickListener {
            Toast.makeText(this, "opening main menu..", Toast.LENGTH_SHORT).show()
            Intent(this, MainMenuActivity::class.java).also {
                startActivity(it)
            }
        }
        clMain.setOnClickListener {
            Toast.makeText(this, "opening main menu..", Toast.LENGTH_SHORT).show()
            Intent(this, MainMenuActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}
