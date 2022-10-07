package com.example.newsapp

import com.example.newsapp.R

data class NewsData(
    val id: Int,
    var image: Int = R.drawable.asd,
    val author: String,
    val title: String,
    val description: String,
    val publishedAt: String
)
