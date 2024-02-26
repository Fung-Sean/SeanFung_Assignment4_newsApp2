package com.example.newsapp2

import com.google.gson.GsonBuilder
import retrofit2.Response
import javax.xml.transform.Source
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type
import com.google.gson.annotations.SerializedName

class NewsApiService {
    // Define ApiService interface
    interface ApiService {
        @GET("top-headlines")
        suspend fun getTopHeadlines(
            @Query("country") country: String,
            @Query("apiKey") apiKey: String
        ): Response<ApiResponse>
    }

    data class Source(
        val id: String?,
        val name: String
    )

    data class News(
        val source: Source,
        val author: String?,
        val title: String,
        val description: String?,
        val url: String,
        val urlToImage: String?,
        val publishedAt: String,
        val content: String?
    )

    data class ApiResponse(
        val status: String,
        @SerializedName("resultTotal") val totalResults: Int,
        val articles: List<News>
    )




}