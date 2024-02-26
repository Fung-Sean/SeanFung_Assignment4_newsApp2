package com.example.newsapp2


import com.google.gson.annotations.SerializedName


private const val TAG = "NewsAPI"
class NewsApiService {
    // Define ApiService interface


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
        val content: String?,
        val imageUrl: String
    )

    data class ApiResponse(
        val status: String,
        @SerializedName("resultTotal") val totalResults: Int,
        val articles: List<News>
    )




}