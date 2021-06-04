package com.example.giphyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import androidx.core.view.isVisible
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.giphyapp.adapter.Adapter
import com.example.giphyapp.models.Data
import com.giphy.sdk.ui.Giphy


class MainActivity : AppCompatActivity(), DetailsClickListener {

    val adapter by lazy {
        Adapter().apply {
            myClickListener = this@MainActivity
        }
    }
    private var progressBar: ProgressBar? = null
    private var viewModel: MyViewModel? = null
    private var after: String? = null


        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            if (savedInstanceState == null) {
                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    add<FragmentGif>(R.id.fragment_container_view)
                }
            }


            Giphy.configure(
                this,
                "5PqUpVUIFD2OwKoADDXgL4rTC4i7lgJh",
                true,
            )


            setupRecyclerView()
            progressBar = findViewById(R.id.progress_bar)
            viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
            observeLiveData()

    }


    fun setupRecyclerView(){
        val myRecyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        myRecyclerView.layoutManager = LinearLayoutManager(this)
        myRecyclerView.adapter = this.adapter
    }



    fun observeLiveData() {
        viewModel?.showProgress?.observe(this) { show ->
            progressBar?.isVisible = show
        }
        viewModel?.setData?.observe(this) { data ->
            adapter.setData(data)
        }
        viewModel?.after?.observe(this) { t -> this@MainActivity.after }

    }



        override fun onClick(results: Data) {
            TODO("Not yet implemented")
        }
}