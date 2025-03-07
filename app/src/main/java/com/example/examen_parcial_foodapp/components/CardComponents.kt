package com.example.examen_parcial_foodapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.examen_parcial_foodapp.models.Category
import com.example.examen_parcial_foodapp.models.Food
import com.example.examen_parcial_foodapp.models.Restaurant

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun CategoryCard(category: Category) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        GlideImage(
            model = category.image, // URL de la imagen
            contentDescription = category.name,
            modifier = Modifier.size(80.dp)
        )
        Text(text = category.name)
    }
}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun RestaurantCard(restaurant: Restaurant) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        GlideImage(
            model = restaurant.image, // URL de la imagen
            contentDescription = restaurant.name,
            modifier = Modifier.size(80.dp)
        )
        Text(text = restaurant.name)
    }
}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun FoodCard(food: Food) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        GlideImage(
            model = food.image, // URL de la imagen
            contentDescription = food.name,
            modifier = Modifier.size(100.dp)
        )
        Text(text = food.name)
        Text(text = "${food.rating} ★", fontSize = 14.sp)
        Text(text = "$${food.price}", fontSize = 14.sp)
    }
}
