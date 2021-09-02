package com.example.kcompose.network.responses

import com.example.kcompose.network.model.RecipeDTO
import com.google.gson.annotations.SerializedName

data class RecipeSearchResponse(
    @SerializedName("count") var count:Int,
    @SerializedName("count") var recipes:List<RecipeDTO>,
    )