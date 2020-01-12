package com.example.stacjepogodowe

import com.google.gson.annotations.Expose
import retrofit2.Call
import retrofit2.http.GET

interface JsonPlaceHolderApi {

    @GET("station/findAll")
    fun getStations(): Call<List<Station>>

}