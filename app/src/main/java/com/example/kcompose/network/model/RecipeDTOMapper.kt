package com.example.kcompose.network.model

import com.example.kcompose.domain.model.Recipe
import com.example.kcompose.domain.util.DomainMapper

class RecipeDTOMapper : DomainMapper<RecipeDTO, Recipe> {
    override fun mapToDomainModel(model: RecipeDTO): Recipe {
        return Recipe(
            id = model.pk,
            title = model.title,
            description = model.description,
            featuredImage = model.featuredImage,
            rating = model.rating,
            publisher = model.publisher,
            sourceUrl = model.sourceUrl,
            cookingInstructions = model.cookingInstructions,
            dateAdded = model.dateAdded,
            dateUpdated = model.dateUpdated,
            ingredients = model.ingredients ?: listOf(),
        )
    }

    override fun mapFromDomainModel(domainModel: Recipe): RecipeDTO {
        return RecipeDTO(
            pk = domainModel.id,
            title = domainModel.title,
            featuredImage = domainModel.featuredImage,
            rating = domainModel.rating,
            publisher = domainModel.publisher,
            sourceUrl = domainModel.sourceUrl,
            cookingInstructions = domainModel.cookingInstructions,
            dateAdded = domainModel.dateAdded,
            dateUpdated = domainModel.dateUpdated,
            ingredients = domainModel.ingredients ?: listOf(),
            description = domainModel.description
        )
    }

    override fun fromDomainList(models: List<Recipe>): List<RecipeDTO> {
        return models.map {
            mapFromDomainModel(it)
        }
    }

    override fun toDomainList(entities: List<RecipeDTO>): List<Recipe> {
        return entities.map {
            mapToDomainModel(it)
        }
    }


}