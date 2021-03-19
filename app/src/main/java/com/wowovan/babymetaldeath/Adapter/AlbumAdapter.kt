package com.wowovan.babymetaldeath.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.wowovan.babymetaldeath.Class.Album
import com.wowovan.babymetaldeath.R
import kotlinx.android.synthetic.main.item_album.view.*

class AlbumAdapter(
    var albums: List<Album>
) : RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder>(){

    inner class AlbumViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_album, parent, false)
        return AlbumViewHolder(view)
    }

    override fun getItemCount(): Int {
        return albums.size
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {

        holder.itemView.apply{
            //var coverr = albums[position].albumCover
            teviAlbumTitle.text = albums[position].albumTitle
            imviCoverAlbum.setImageResource(albums[position].albumCover)
            teviAlbumSongs.text = albums[position].albumSongs
            teviAlbumYear.text = albums[position].albumYear.toString()

        }


        holder.itemView.setOnClickListener(){
            Toast.makeText(holder.itemView.context, "anda membuka "+ albums[holder.adapterPosition].albumTitle, Toast.LENGTH_SHORT).show()
        }
    }


}