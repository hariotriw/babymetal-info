package com.wowovan.babymetaldeath.Data

import com.wowovan.babymetaldeath.Class.Album
import com.wowovan.babymetaldeath.R

object AlbumData {

    var albumList = mutableListOf(
        Album(
            "Babymetal",
            R.drawable.album_babymetal,

            "1. Babymetal Death \n" +
                    "2. Megitsune \n" +
                    "3. Gimme Chocolate!! \n" +
                    "4. Iine! \n" +
                    "5. Akatsuki \n" +
                    "6. Doki Doki Morning \n" +
                    "7. Onedari Daisakusen \n" +
                    "8. Song 4 \n" +
                    "9. Uki Uki Midnight \n" +
                    "10. Catch me if you can \n" +
                    "11. Rondo of Nightmare \n" +
                    "12. HeadBangeeeeerrrrr!!!!! \n" +
                    "13. Ijime,Dame,Zettai \n" +
                    "14. Road of Resistance ",
            2014
        ),
        Album(
            "Metal Resistance",
            R.drawable.album_metalresistance,
            "1. Road of Resistance \n" +
                    "2. KARATE \n" +
                    "3. Awadama Fever \n" +
                    "4. YAVA! \n" +
                    "5. Amore \n" +
                    "6. Meta Taro \n" +
                    "7. Syncopation \n" +
                    "8. GJ! \n" +
                    "9. Sis. Anger \n" +
                    "10. No Rain, No Rainbow \n" +
                    "11. Tales of The Destinies \n" +
                    "12. THE ONE - English ver. \n",
            2016
        ),
        Album(
            "Metal Galaxy",
            R.drawable.album_metalgalaxy,
            "1. FUTURE METAL \n" +
                    "2. DA DA DANCE \n" +
                    "3. Elevator Girl - English version \n" +
                    "4. Shanti Shanti Shanti \n" +
                    "5. Oh! MAJINAI \n" +
                    "6. Brand New Day \n" +
                    "7. Night Night Burn! \n" +
                    "8. IN THE NAME OF \n" +
                    "9. Distortion \n" +
                    "10. PA PA YA!! \n" +
                    "11. Kagerou \n" +
                    "12. Starlight \n" +
                    "13. Shine \n" +
                    "14. Arkadia \n",
            2019
        )
    )

    val listAlbum:MutableList<Album>get(){
        val list = albumList
        return list
    }
}