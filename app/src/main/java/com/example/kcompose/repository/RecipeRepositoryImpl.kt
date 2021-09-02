package com.example.kcompose.repository

import com.example.kcompose.domain.model.Recipe
import com.example.kcompose.domain.util.DomainMapper
import com.example.kcompose.network.RecipeService
import com.example.kcompose.network.model.RecipeDTO
import com.example.kcompose.network.model.RecipeDTOMapper

class RecipeRepositoryImpl(
    private val recipeService: RecipeService,
    private val mapper: RecipeDTOMapper
) : RecipeRepository {
    override suspend fun search(token: String, page: Int, query: String): List<Recipe> {
        val result = this.recipeService.search(token = token, page = page, query = query).recipes
        return mapper.toDomainList(result)
    }

    override suspend fun get(token: String, id: Int): Recipe {
        val result = this.recipeService.get(token = token, id = id)
        return mapper.mapToDomainModel(result)
    }
}