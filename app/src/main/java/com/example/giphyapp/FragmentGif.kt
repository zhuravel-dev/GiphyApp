package com.example.giphyapp


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class FragmentGif: Fragment(R.id.fragment_container_view) {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // return super.onCreateView(inflater, container, savedInstanceState)

        val rootView = inflater.inflate(R.layout.full_gif_view, container, false)

        return rootView
    }

}