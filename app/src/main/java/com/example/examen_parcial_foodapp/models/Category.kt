package com.example.examen_parcial_foodapp.models

data class Category(
    val name: String,
    val image: String
)

data class Restaurant(
    val name: String,
    val image: String
)

data class Food(
    val name: String,
    val image: String,
    val rating: Float,
    val price: Double
)

val categories = listOf(
    Category("Fast Food", "https://pin.it/5D6zFqnPE.jpg"),
    Category("Chinese", "https://example.com/chinese.jpg"),
    Category("Italian", "https://example.com/italian.jpg"),
    Category("Mexican", "https://example.com/mexican.jpg"),
    Category("Indian", "https://example.com/indian.jpg")
)

val restaurants = listOf(
    Restaurant("Burger King", "https://example.com/burgerking.jpg"),
    Restaurant("McDonald's", "https://example.com/mcdonalds.jpg"),
    Restaurant("KFC", "https://example.com/kfc.jpg"),
    Restaurant("Pizza Hut", "https://example.com/pizzahut.jpg"),
    Restaurant("Subway", "https://example.com/subway.jpg")
)

val foods = listOf(
    Food("Cheeseburger", "https://example.com/cheeseburger.jpg", 4.5f, 5.99),
    Food("Sweet and Sour Chicken", "https://example.com/sweetandsour.jpg", 4.7f, 7.99),
    Food("Pizza Margherita", "https://example.com/pizzamargherita.jpg", 4.8f, 9.99),
    Food("Tacos", "https://example.com/tacos.jpg", 4.3f, 3.99),
    Food("Butter Chicken", "https://example.com/butterchicken.jpg", 4.6f, 8.49)
)