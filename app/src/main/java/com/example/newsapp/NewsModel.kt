package com.example.newsapp

data class NewsModel (
    var title: String,
    var link: String,
    var imageUrl: String? = null
)

fun List<NewsItem>.transform() : List<NewsModel> {
    return this.map {
        NewsModel(
            title = it.title ?: "",
            link = it.link ?: "",
            imageUrl = null
        )
    }
}
