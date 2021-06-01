package com.example.giphyapp.models

import com.google.gson.annotations.SerializedName


data class Meta (

	@SerializedName("status") val status : Int,
	@SerializedName("msg") val msg : String,
	@SerializedName("response_id") val response_id : String
)