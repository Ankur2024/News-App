package com.loc.newsapp.domain.model

import com.google.gson.annotations.SerializedName

data class Source(
    @SerializedName("id")
    val id: String, // wired
    @SerializedName("name")
    val name: String // Gizmodo.com
)
