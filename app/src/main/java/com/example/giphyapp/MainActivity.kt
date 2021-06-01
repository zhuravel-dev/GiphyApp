package com.example.giphyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.giphy.sdk.ui.Giphy

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Giphy.configure(
            this,
            "5PqUpVUIFD2OwKoADDXgL4rTC4i7lgJh",
            true,
        )


    }
}