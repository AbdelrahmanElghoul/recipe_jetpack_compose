package com.example.kcompose.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Recipe(
    val id: Int?,
    val title:String?,
    val description:String?,
    val publisher:String?,
    val featuredImage:String?,
    val rating:Int?=0,
    val sourceUrl:String?,
    val cookingInstructions:String?,
    val ingredients:List<String>?= listOf(),
    val dateAdded:String?,
    val dateUpdated:String?,

    ) : Parcelable