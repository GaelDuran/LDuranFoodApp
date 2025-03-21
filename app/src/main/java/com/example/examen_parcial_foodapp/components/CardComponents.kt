package com.example.examen_parcial_foodapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.examen_parcial_foodapp.models.Category
import com.example.examen_parcial_foodapp.models.Food
import com.example.examen_parcial_foodapp.models.Restaurant
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun CategoryCard(category: Category) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Red, shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            GlideImage(
                model = category.image,
                contentDescription = category.name,
                modifier = Modifier.size(70.dp)
            )
        }
        Text(text = category.name)
    }
}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun RestaurantCard(restaurant: Restaurant) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        GlideImage(
            model = restaurant.image,
            contentDescription = restaurant.name,
            modifier = Modifier.size(80.dp)
        )
        Text(text = restaurant.name)
    }
}

@Composable
fun FoodSection(foods: List<Food>) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(foods.chunked(2)){ rowFoods ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                rowFoods.forEach { food ->
                    FoodCard(food)
                }
            }
        }
    }
}



@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun FoodCard(food: Food) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(8.dp)
            .width(150.dp)
    ) {
        Box(contentAlignment = Alignment.TopEnd) {
            GlideImage(
                model = food.image,
                contentDescription = food.name,
                modifier = Modifier
                    .size(120.dp)
                    .background(Color.LightGray, shape = RoundedCornerShape(8.dp))
            )

            Box(
                modifier = Modifier
                    .background(Color.Red, shape = RoundedCornerShape(8.dp))
                    .padding(horizontal = 8.dp, vertical = 4.dp)
            ) {
                Text(
                    text = "$${food.price}",
                    color = Color.White,
                    fontSize = 12.sp
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "★", color = Color.Green, fontSize = 14.sp)
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "${food.rating}", fontSize = 12.sp)
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = food.name,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            maxLines = 1
        )
    }
}