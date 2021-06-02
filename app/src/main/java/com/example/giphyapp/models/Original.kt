package com.example.giphyapp.models

import com.google.gson.annotations.SerializedName


data class Original (

	@SerializedName("frames") val frames : Int,
	@SerializedName("hash") val hash : String,
	@SerializedName("height") val height : Int,
	@SerializedName("mp4") val mp4 : String,
	@SerializedName("mp4_size") val mp4_size : Int,
	@SerializedName("size") val size : Int,
	@SerializedName("url") val url : String,
	@SerializedName("webp") val webp : String,
	@SerializedName("webp_size") val webp_size : Int,
	@SerializedName("width") val width : Int
)