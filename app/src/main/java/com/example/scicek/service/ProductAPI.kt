package com.example.scicek.service

import com.example.scicek.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface ProductAPI {



    @GET("atilsamancioglu/BTK23-DataSet/main/products.json")
    suspend fun getData(): Response<List<Product>>



}