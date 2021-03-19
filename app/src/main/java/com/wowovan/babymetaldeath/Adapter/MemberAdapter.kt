package com.wowovan.babymetaldeath.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.wowovan.babymetaldeath.Class.Member
import com.wowovan.babymetaldeath.R
import kotlinx.android.synthetic.main.item_member.view.*

class MemberAdapter(
    var members : List<Member>
) : RecyclerView.Adapter<MemberAdapter.MemberViewHolder>() {

    inner class MemberViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberAdapter.MemberViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_member, parent, false)
            return MemberViewHolder(view)
    }

    override fun getItemCount(): Int {
        return members.size
    }

    override fun onBindViewHolder(holder: MemberAdapter.MemberViewHolder, position: Int) {

        holder.itemView.apply {
            tvMemberNickname.text = members[position].memberNickname
            tvMemberNama.text = "Name           : "+members[position].memberName
            members[position].memberBorn
            members[position].memberOrigin
            tvMemberActive.text = "Years Active : "+members[position].memberYearAvtive
            ivMemberMenuCover.setImageResource(members[position].memberProfileImage)
            members[position].memberType
            tvMemberPosition.text = "Position       : "+members[position].memberPosition
            members[position].memberDescription

        }


        holder.itemView.setOnClickListener(){
            Toast.makeText(holder.itemView.context, "anda membuka "+ members[holder.adapterPosition].memberName, Toast.LENGTH_SHORT).show()
        }
    }
}