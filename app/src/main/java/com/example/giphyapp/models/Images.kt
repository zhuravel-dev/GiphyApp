package com.example.giphyapp.models

import com.google.gson.annotations.SerializedName


data class Images (

	@SerializedName("downsized_large") val downsized_large : Downsized_large,
	@SerializedName("fixed_height_small_still") val fixed_height_small_still : Fixed_height_small_still,
	@SerializedName("original") val original : Original,
	@SerializedName("fixed_height_downsampled") val fixed_height_downsampled : Fixed_height_downsampled,
	@SerializedName("downsized_still") val downsized_still : Downsized_still,
	@SerializedName("fixed_height_still") val fixed_height_still : Fixed_height_still,
	@SerializedName("downsized_medium") val downsized_medium : Downsized_medium,
	@SerializedName("downsized") val downsized : Downsized,
	@SerializedName("preview_webp") val preview_webp : Preview_webp,
	@SerializedName("original_mp4") val original_mp4 : Original_mp4,
	@SerializedName("fixed_height_small") val fixed_height_small : Fixed_height_small,
	@SerializedName("fixed_height") val fixed_height : Fixed_height,
	@SerializedName("downsized_small") val downsized_small : Downsized_small,
	@SerializedName("preview") val preview : Preview,
	@SerializedName("fixed_width_downsampled") val fixed_width_downsampled : Fixed_width_downsampled,
	@SerializedName("fixed_width_small_still") val fixed_width_small_still : Fixed_width_small_still,
	@SerializedName("fixed_width_small") val fixed_width_small : Fixed_width_small,
	@SerializedName("original_still") val original_still : Original_still,
	@SerializedName("fixed_width_still") val fixed_width_still : Fixed_width_still,
	@SerializedName("looping") val looping : Looping,
	@SerializedName("fixed_width") val fixed_width : Fixed_width,
	@SerializedName("preview_gif") val preview_gif : Preview_gif,
	@SerializedName("480w_still") val A480w_still : A480w_still
)