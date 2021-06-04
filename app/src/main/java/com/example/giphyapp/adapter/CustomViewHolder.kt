package com.example.giphyapp.adapter

import android.annotation.SuppressLint
import android.graphics.BitmapFactory
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.giphyapp.DetailsClickListener
import com.example.giphyapp.R
import com.example.giphyapp.models.Data
import com.example.giphyapp.models.Preview_gif
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


    fun bind(result: Data, clickListener: DetailsClickListener?) {
        setGif(result.image_url, gifView)
        itemView.setOnClickListener {
            clickListener?.onClick(result)
        }
    }


    @SuppressLint("LogNotTimber")
    private fun setGif(link: String, imageView: ImageView) {
        try {
            val url = URL(link)
            executor.submit {
                val bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream())
                uiHandler.post { imageView.setImageBitmap(bmp) }
            }.get()
        } catch (ex: MalformedURLException) {
            Log.e(CustomViewHolder::class.java.simpleName, ex.localizedMessage.orEmpty())
        }

        }
    }

