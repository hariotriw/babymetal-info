package com.wowovan.babymetaldeath.Class

import com.wowovan.babymetaldeath.R

data class Member(
    var memberNickname : String,
    var memberName : String,
    var memberBorn : String,
    var memberOrigin : String,
    var memberYearAvtive : String,
    var memberProfileImage : Int = R.drawable.ic_profile_default_foreground,
    var memberType : String,
    var memberPosition: String,
    var memberDescription : String
)