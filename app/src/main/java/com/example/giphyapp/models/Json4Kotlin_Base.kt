package com.example.giphyapp.models

import com.google.gson.annotations.SerializedName


data class Json4Kotlin_Base (

	@SerializedName("data") val data : List<String>,
	@SerializedName("pagination") val pagination : Pagination,
	@SerializedName("meta") val meta : Meta
)