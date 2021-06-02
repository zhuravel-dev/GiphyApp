package com.example.giphyapp.models

import com.google.gson.annotations.SerializedName


data class User (

	@SerializedName("avatar_url") val avatar_url : String,
	@SerializedName("banner_image") val banner_image : String,
	@SerializedName("banner_url") val banner_url : String,
	@SerializedName("profile_url") val profile_url : String,
	@SerializedName("username") val username : String,
	@SerializedName("display_name") val display_name : String,
	@SerializedName("description") val description : String,
	@SerializedName("is_verified") val is_verified : Boolean,
	@SerializedName("website_url") val website_url : String,
	@SerializedName("instagram_url") val instagram_url : String
)