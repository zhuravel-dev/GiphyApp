package com.example.giphyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.giphyapp.adapter.Adapter
import com.example.giphyapp.models.Preview_gif
import com.giphy.sdk.ui.Giphy


class MainActivity : AppCompatActivity(), DetailsClickListener {

    val adapter by lazy {
        Adapter().apply {
            myClickListener = this@MainActivity
        }
    }
    private var progressBar: ProgressBar? = null
    private var viewModel: MyViewModel? = null



        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressBar = findViewById(R.id.progress_bar)
        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)


        Giphy.configure(
            this,
            "5PqUpVUIFD2OwKoADDXgL4rTC4i7lgJh",
            true,
        )


        fun setupRecyclerView(){
            val myRecyclerView = findViewById<RecyclerView>(R.id.recycler_view)
            myRecyclerView.layoutManager = LinearLayoutManager(this)
            myRecyclerView.adapter = this.adapter
        }

    }


        override fun onClick(results: Preview_gif) {
            TODO("Not yet implemented")
        }
}