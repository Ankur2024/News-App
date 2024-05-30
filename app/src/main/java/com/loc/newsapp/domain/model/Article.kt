package com.loc.newsapp.domain.model

import com.google.gson.annotations.SerializedName
data class Article(
    @SerializedName("author")
    val author: String, // Vinamrata Chaturvedi, Quartz
    @SerializedName("content")
    val content: String, // On January 3, 2009, Bitcoins creator, Satoshi Nakamoto, mined the first block of the Bitcoin blockchain, known as the Genesis Block, which contained a reward of 50 Bitcoin. The technical foundations … [+1156 chars]
    @SerializedName("description")
    val description: String, // On May 22, 2010, a man in Florida paid 10,000 Bitcoin for pizza.Read more...
    @SerializedName("publishedAt")
    val publishedAt: String, // 2024-05-20T13:20:00Z
    @SerializedName("source")
    val source: Source,
    @SerializedName("title")
    val title: String, // Everything to Know About Bitcoin Pizza Day
    @SerializedName("url")
    val url: String, // https://gizmodo.com/bitcoin-pizza-day-date-origin-history-cryptocurrency-1851487831
    @SerializedName("urlToImage")
    val urlToImage: String // https://i.kinja-img.com/image/upload/c_fill,h_675,pg_1,q_80,w_1200/98aec6479bad523f5c89763f4acf0cf9.jpg
)
