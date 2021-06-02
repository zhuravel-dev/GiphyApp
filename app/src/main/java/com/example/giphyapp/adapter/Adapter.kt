package com.example.giphyapp.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.giphyapp.DetailsClickListener
import com.example.giphyapp.R
import com.example.giphyapp.models.Json4Kotlin_Base
import com.example.giphyapp.models.Meta

class Adapter : RecyclerView.Adapter<CustomViewHolder>() {


    private var listOfGifs : MutableList<Meta> = mutableListOf()
    var myClickListener: DetailsClickListener? = null


    fun setData(response: List<Meta>){
        listOfGifs.addAll(response)
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int = listOfGifs.size


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        Log.d("Adapter", "onCreateViewHolder")
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_view, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        Log.d("Adapter", "onBindViewHolder with position $position")
        (holder as? CustomViewHolder)?.bind(listOfGifs[position], myClickListener)
    }

}