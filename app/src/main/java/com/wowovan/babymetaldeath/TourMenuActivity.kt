package com.wowovan.babymetaldeath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import com.wowovan.babymetaldeath.Adapter.TourAdapter
import com.wowovan.babymetaldeath.Class.Show
import com.wowovan.babymetaldeath.Data.ShowData
import kotlinx.android.synthetic.main.activity_menu_tour.*

class TourMenuActivity : AppCompatActivity() {

    private var list: MutableList<Show> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_tour)
        setActionBarTitle("Tours")

        list.addAll(ShowData.daftarShow)

        val tourAdapter = TourAdapter(ShowData.daftarShow)
        rvShowTour.adapter = tourAdapter
        rvShowTour.layoutManager = LinearLayoutManager(this)

    }


    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}