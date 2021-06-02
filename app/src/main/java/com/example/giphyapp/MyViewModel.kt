package com.example.giphyapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.giphyapp.models.Data
import com.example.giphyapp.models.Json4Kotlin_Base
import com.example.giphyapp.models.Preview_gif
import com.example.giphyapp.retrofit.GetContent
import com.example.giphyapp.retrofit.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MyViewModel : ViewModel() {

    private val _showProgress = MutableLiveData<Boolean>()
    val showProgress: LiveData<Boolean> = _showProgress


    private val _setData = MutableLiveData<List<Data>>()
    val setData: LiveData<List<Data>> = _setData

    private val _after = MutableLiveData<String>()
    val after: LiveData<String> = _after


    fun getAllData() {
        _showProgress.postValue(true)
        val service = RetrofitClient.getRetrofit().create(GetContent::class.java)
        val call: Call<Json4Kotlin_Base> = service.getContent()
        call.enqueue(object : Callback<Json4Kotlin_Base> {

            override fun onResponse(
                call: Call<Json4Kotlin_Base>,
                response: Response<Json4Kotlin_Base>
            ) {
                if (response.isSuccessful) {
                    val body: Json4Kotlin_Base? = response.body()
                    if (body != null) {
                        val gifResponse = body.data
                        _setData.postValue(gifResponse)
                    }
                }
                _showProgress.postValue(false)
            }

            override fun onFailure(call: Call<Json4Kotlin_Base>, t: Throwable) {
                _showProgress.postValue(false)
            }


        })
    }

}