package com.example.giphyapp.models

import com.google.gson.annotations.SerializedName


data class Data (

	@SerializedName("type") val type : String,
	@SerializedName("id") val id : String,
	@SerializedName("url") val url : String,
	@SerializedName("slug") val slug : String,
	@SerializedName("bitly_gif_url") val bitly_gif_url : String,
	@SerializedName("bitly_url") val bitly_url : String,
	@SerializedName("embed_url") val embed_url : String,
	@SerializedName("username") val username : String,
	@SerializedName("source") val source : String,
	@SerializedName("title") val title : String,
	@SerializedName("rating") val rating : String,
	@SerializedName("content_url") val content_url : String,
	@SerializedName("source_tld") val source_tld : String,
	@SerializedName("source_post_url") val source_post_url : String,
	@SerializedName("is_sticker") val is_sticker : Int,
	@SerializedName("import_datetime") val import_datetime : String,
	@SerializedName("trending_datetime") val trending_datetime : String,
	@SerializedName("images") val images : Images,
	@SerializedName("user") val user : User,
	@SerializedName("image_original_url") val image_original_url : String,
	@SerializedName("image_url") val image_url : String,
	@SerializedName("image_mp4_url") val image_mp4_url : String,
	@SerializedName("image_frames") val image_frames : Int,
	@SerializedName("image_width") val image_width : Int,
	@SerializedName("image_height") val image_height : Int,
	@SerializedName("fixed_height_downsampled_url") val fixed_height_downsampled_url : String,
	@SerializedName("fixed_height_downsampled_width") val fixed_height_downsampled_width : Int,
	@SerializedName("fixed_height_downsampled_height") val fixed_height_downsampled_height : Int,
	@SerializedName("fixed_width_downsampled_url") val fixed_width_downsampled_url : String,
	@SerializedName("fixed_width_downsampled_width") val fixed_width_downsampled_width : Int,
	@SerializedName("fixed_width_downsampled_height") val fixed_width_downsampled_height : Int,
	@SerializedName("fixed_height_small_url") val fixed_height_small_url : String,
	@SerializedName("fixed_height_small_still_url") val fixed_height_small_still_url : String,
	@SerializedName("fixed_height_small_width") val fixed_height_small_width : Int,
	@SerializedName("fixed_height_small_height") val fixed_height_small_height : Int,
	@SerializedName("fixed_width_small_url") val fixed_width_small_url : String,
	@SerializedName("fixed_width_small_still_url") val fixed_width_small_still_url : String,
	@SerializedName("fixed_width_small_width") val fixed_width_small_width : Int,
	@SerializedName("fixed_width_small_height") val fixed_width_small_height : Int,
	@SerializedName("caption") val caption : String
)