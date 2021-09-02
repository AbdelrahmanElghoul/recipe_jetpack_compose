package com.example.kcompose.network.model

import com.google.gson.annotations.SerializedName

data class RecipeDTO(
    @SerializedName("pk") var pk: Int?,
    @SerializedName("title") var title: String?,
    @SerializedName("publisher") var publisher: String?,
    @SerializedName("featured_image") var featuredImage: String?,
    @SerializedName("rating") var rating: Int?,
    @SerializedName("source_utl") var sourceUrl: String?,
    @SerializedName("description") var description: String?,
    @SerializedName("ingredients") var ingredients: List<String>?,
    @SerializedName("date_added") var dateAdded: String?,
    @SerializedName("date_updated") var dateUpdated: String?,
    @SerializedName("cooking_instructions") var cookingInstructions: String?,
)