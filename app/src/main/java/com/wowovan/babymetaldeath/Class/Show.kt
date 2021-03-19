package com.wowovan.babymetaldeath.Class

data class Show(
    var showId : String,
    var showDate : String,
    var showYear : Int = 2000,
    var showVenue : String,
    var showEvent : String,
    var showName : String,
    var showType : String,
    var showSetlist : String,
    var showNote : String,
    var showBand : String,
    var showDancer : String
)