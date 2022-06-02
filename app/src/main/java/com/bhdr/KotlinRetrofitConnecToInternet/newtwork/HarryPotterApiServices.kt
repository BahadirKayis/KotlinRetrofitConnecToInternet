package com.bhdr.KotlinRetrofitConnecToInternet.newtwork

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import retrofit2.http.GET

//değişmeyeceği için const
private const val BASE_URL = "https://canerture.com/api/harrypotterapp/"
private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit=Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory
        .create(moshi)).baseUrl(BASE_URL).build()

interface HarryPotterApiServices{
    @GET("all_data.php")//Coroutines
    suspend fun getCharacters(): CharacterResponse
}
object HarryPotterApi{//Object bir yapıdan bir kez oluşturmak ve bir çok yerde kullanmak için
    val retrofitService:HarryPotterApiServices by lazy { retrofit.create(HarryPotterApiServices::class.java) }

}