package com.example.newsapp

import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml

@Xml(name="rss")
data class NewsRss (
    @Element(name="channel")
    val channel: RssChannel
)

@Xml(name="channel")
data class  RssChannel(
    @PropertyElement(name="title")
    val title: String,

    @Element(name="item")
    val items: List<NewItem>? = null,
)

@Xml(name="item")
data class NewItem (
    @PropertyElement(name="title")
    val title: String? = null,

    @PropertyElement(name="link")
    val link: String? = null,
        )