package com.example.giphyapp.models

import com.google.gson.annotations.SerializedName


data class A480w_still (

	@SerializedName("url") val url : String,
	@SerializedName("width") val width : Int,
	@SerializedName("height") val height : Int
)