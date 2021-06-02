package com.example.giphyapp.models

import com.google.gson.annotations.SerializedName


data class Looping (

	@SerializedName("mp4") val mp4 : String,
	@SerializedName("mp4_size") val mp4_size : Int
)