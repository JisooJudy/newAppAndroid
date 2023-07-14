package com.example.newsapp

import retrofit2.Call
import retrofit2.http.GET

interface NewsService {
    @GET("rss?hl=ko&gl=KR&ceid=KR:ko")
    fun mainFeed(): Call<NewsRss>

    @GET("rss/topics/CAAqIQgKIhtDQkFTRGdvSUwyMHZNRFZ4ZERBU0FtdHZLQUFQAQ?hl=ko&gl=KR&ceid=KR%3Ako")
    fun politicsNews(): Call<NewsRss>

    @GET("rss/topics/CAAqIggKIhxDQkFTRHdvSkwyMHZNR2RtY0hNekVnSnJieWdBUAE?hl=ko&gl=KR&ceid=KR%3Ako")
    fun economyNews(): Call<NewsRss>

    @GET("rss/topics/CAAqIQgKIhtDQkFTRGdvSUwyMHZNRGs0ZDNJU0FtdHZLQUFQAQ?hl=ko&gl=KR&ceid=KR%3Ako")
    fun socialNews(): Call<NewsRss>

    @GET("rss/topics/CAAqIQgKIhtDQkFTRGdvSUwyMHZNRE41ZEdNU0FtdHZLQUFQAQ?hl=ko&gl=KR&ceid=KR%3Ako")
    fun itNews(): Call<NewsRss>

    @GET("rss/topics/CAAqJQgKIh9DQkFTRVFvTEwyY3ZNVEl4ZEdKNVozUVNBbXR2S0FBUAE?hl=ko&gl=KR&ceid=KR%3Ako")
    fun sportsNews(): Call<NewsRss>

}