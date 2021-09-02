package com.example.kcompose.repository

import com.example.kcompose.domain.model.Recipe

interface RecipeRepository
{
    /// always return (business)domain Model not DTO/Entity
    suspend fun search(token:String,page:Int,query:String):List<Recipe>

    suspend fun get(token:String, id:Int):Recipe
}