package com.example.examen_parcial_foodapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.examen_parcial_foodapp.components.CategoryCard
import com.example.examen_parcial_foodapp.components.FoodCard
import com.example.examen_parcial_foodapp.components.FoodSection
import com.example.examen_parcial_foodapp.components.RestaurantCard
import com.example.examen_parcial_foodapp.models.categories
import com.example.examen_parcial_foodapp.models.foods
import com.example.examen_parcial_foodapp.models.restaurants
import com.example.examen_parcial_foodapp.ui.theme.Examen_Parcial_FoodAppTheme
import kotlin.text.chunked

@Composable
fun HomeScreen(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Hola, Gael",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            IconButton(onClick = { /* Lógica de logout */ }) {
                Icon(Icons.AutoMirrored.Filled.ExitToApp, contentDescription = "Cerrar sesión")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Nuestras Categorias", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(categories) { category ->
                CategoryCard(category = category)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Busca los Mejores Restaurantes",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(restaurants) { restaurant ->
                RestaurantCard(restaurant = restaurant)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Nuestras Mejores comidas", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(foods.chunked(2)) { rowFoods ->
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
}

//    @Composable
//    fun HomeScreenPreview() {
//        Examen_Parcial_FoodAppTheme {
//            HomeScreen(innerPadding = PaddingValues(16.dp))
//        }
//    }
//}