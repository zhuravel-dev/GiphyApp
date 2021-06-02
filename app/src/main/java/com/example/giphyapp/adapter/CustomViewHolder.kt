package com.example.giphyapp.adapter

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.giphyapp.DetailsClickListener
import com.example.giphyapp.R
import com.example.giphyapp.models.Json4Kotlin_Base
import com.example.giphyapp.models.Meta
import com.giphy.sdk.ui.views.GifView
import java.net.MalformedURLException
import java.net.URL
import java.util.concurrent.Executors


class CustomViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    private val executor = Executors.newSingleThreadExecutor()
    private val uiHandler = Handler(Looper.getMainLooper())
    private val gifView: GifView by lazy {
        itemView.findViewById(R.id.gifView)
    }


    fun bind(result: Meta, clickListener: DetailsClickListener?) {
        setGif(result.response_id, gifView)
        itemView.setOnClickListener {
            clickListener?.onClick(result)
        }
    }


    private fun setGif(link: String, gifView: GifView) {
        try {
            val url = URL(link)
            executor.submit {
                val bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream())
                uiHandler.post {gifView.setImageURI("v1/gifs/search") }
            }.get()
        } catch (ex: MalformedURLException) {
            Log.e(CustomViewHolder::class.java.simpleName, ex.localizedMessage.orEmpty())
        }

        }
    }

