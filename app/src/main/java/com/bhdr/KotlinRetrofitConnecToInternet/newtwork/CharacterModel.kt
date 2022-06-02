package com.bhdr.KotlinRetrofitConnecToInternet.newtwork

import android.os.Parcelable
import com.squareup.moshi.Json


data class CharacterModel(
    //Moshi kullanınca
    val id: Int,
   val name: String,
    @Json(name="image_url") val imageUrl: String,
    val house: String
)
