package com.example.newsapp2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp2.databinding.ListNewsBinding

class NewsAdapter(
    private val binding: ListNewsBinding

) : RecyclerView.ViewHolder(binding.root){

    fun bind(news: NewsApiService.News) {
        // Bind news data to views in the item layout
        binding.newsTitle.text = news.title


        binding.root.setOnClickListener {
            Toast.makeText(
                binding.root.context,
                "${news.title} clicked",
                Toast.LENGTH_SHORT
            ).show()
        }
        // Bind other news data similarly
    }
}