package com.wowovan.babymetaldeath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import com.wowovan.babymetaldeath.Adapter.MemberAdapter
import com.wowovan.babymetaldeath.Class.Album
import com.wowovan.babymetaldeath.Class.Member
import com.wowovan.babymetaldeath.Class.Show
import com.wowovan.babymetaldeath.Data.AlbumData
import com.wowovan.babymetaldeath.Data.MemberData
import kotlinx.android.synthetic.main.activity_menu_member.*

class MemberMenuActivity : AppCompatActivity() {

    private var list: MutableList<Member> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_member)
        setActionBarTitle("Member")

        list.addAll(MemberData.memberData)

        val listCore: List<Member> = MemberData.memberData.filter{ it.memberType in setOf("core")}
        val listKami: List<Member> = MemberData.memberData.filter{ it.memberType in setOf("kami")}
        /*btn.setOnClickListener {
            finish()
        }*/

        val adapterMemberCore = MemberAdapter(listCore)
        rvMemberCore.adapter = adapterMemberCore
        rvMemberCore.layoutManager = LinearLayoutManager(this)

        val adapterMemberKami = MemberAdapter(listKami)
        rvMemberKami.adapter = adapterMemberKami
        rvMemberKami.layoutManager = LinearLayoutManager(this)

    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}