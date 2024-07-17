package com.kamaldgrt.recipeapp

data class Category(
    val idCategory: String,
    var strCategory: String,
    var strCategoryThumb: String,
    var strCategoryDescription: String
)

data class CategoriesResponse(
    val categories: List<Category>
)
