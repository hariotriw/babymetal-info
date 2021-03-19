package com.wowovan.babymetaldeath.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.wowovan.babymetaldeath.R
import com.wowovan.babymetaldeath.Class.Show
import kotlinx.android.synthetic.main.item_tour.view.*

class TourAdapter(
    var tours: List<Show>
) : RecyclerView.Adapter<TourAdapter.TourViewHolder>(){

    inner class TourViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TourViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tour_2, parent, false)
        return TourViewHolder(view)
    }

    override fun getItemCount(): Int {
        return tours.size
    }

    override fun onBindViewHolder(holder: TourViewHolder, position: Int) {
        holder.itemView.apply{
            tvMenuNomor.text = (position + 1).toString()
            tvMenuDate.text = tours[position].showDate
            tvMenuYear.text = tours[position].showYear.toString()
            tvMenuVenue.text = tours[position].showVenue
            tvMenuNama.text = tours[position].showName
        }

        holder.itemView.setOnClickListener(){
            Toast.makeText(holder.itemView.context, "membuka... ", Toast.LENGTH_SHORT).show()
        }

    }

}