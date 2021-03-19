package com.wowovan.babymetaldeath.Data

import com.wowovan.babymetaldeath.Class.Member
import com.wowovan.babymetaldeath.R
import java.sql.Types.NULL

object MemberData {
    val memberData = mutableListOf(
        Member(
            "Sumetal",
            "Nakamoto Suzuka",
            "December 20, 1997",
            "Hiroshima, Hiroshima Prefecture, Japan",
            "2007 - present",
            R.drawable.staymetal_su,
            "core",
            "Lead Vocal and Dancer",
            "bla bla"
        ),
        Member(
            "Moametal",
            "Kikuchi Moa",
            "July 4, 1999",
            "Nagoya, Aichi Prefecture, Japan",
            "2010 - present",
            R.drawable.staymetal_moa,
            "core",
            "Background Vocal and Dancer",
            "bla bla"
        ),
        Member(
            "Yuimetal",
            "Mizuno Yui",
            "June 20, 1999",
            "Kanagawa Prefecture, Japan",
            "2010 - 2018",
            R.drawable.staymetal_yui,
            "kami",
            "Background Vocal and Dancer",
            "bla bla"
        ),
        Member(
            "Ohmura",
            "Takayoshi Ohmura",
            "December 26, 1983",
            "Osaka Prefecture, Japan",
            "2005 - present",
            NULL,
            "kami",
            "Guitar",
            "bla bla"
        )
    )
}