package com.shadow.mvvm_recyclerview.data

import com.shadow.mvvm_recyclerview.data.models.Property
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface PropertiesApi {

    @GET("properties")
    suspend fun getPropeties(): Response<List<Property>>

    companion object {
        operator fun invoke(): PropertiesApi {
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://propscout.co.ke/api/")
                .build()
                .create(PropertiesApi::class.java)
        }
    }
}