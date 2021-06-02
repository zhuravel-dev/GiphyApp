package com.example.giphyapp.models

import com.google.gson.annotations.SerializedName


data class Fixed_width_downsampled (

	@SerializedName("height") val height : Int,
	@SerializedName("size") val size : Int,
	@SerializedName("url") val url : String,
	@SerializedName("webp") val webp : String,
	@SerializedName("webp_size") val webp_size : Int,
	@SerializedName("width") val width : Int
)