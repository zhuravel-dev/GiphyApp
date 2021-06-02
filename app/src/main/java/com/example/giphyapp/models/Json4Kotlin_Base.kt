package com.example.giphyapp.models

import com.google.gson.annotations.SerializedName

data class Json4Kotlin_Base (

	@SerializedName("data") val data : Data,
	@SerializedName("meta") val meta : Meta
)