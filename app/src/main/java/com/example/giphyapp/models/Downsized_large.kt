package com.example.giphyapp.models

import com.google.gson.annotations.SerializedName


data class Downsized_large (

	@SerializedName("height") val height : Int,
	@SerializedName("size") val size : Int,
	@SerializedName("url") val url : String,
	@SerializedName("width") val width : Int
)