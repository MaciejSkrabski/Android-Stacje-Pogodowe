package com.example.stacjepogodowe

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Sensor (
    @SerializedName("id")
    val sensorId: Int,
    @SerializedName("paramName")
    val paramName: String
)