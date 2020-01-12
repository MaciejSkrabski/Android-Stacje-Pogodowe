package com.example.stacjepogodowe

import com.google.gson.annotations.SerializedName

data class Station
    (
    @SerializedName("id") val stationId: Int,
    @SerializedName("stationName") val stationName: String
)