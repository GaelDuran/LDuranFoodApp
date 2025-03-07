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
    Category("Fast Food", "https://static.vecteezy.com/system/resources/previews/019/607/567/non_2x/fast-food-vector-clipart-design-graphic-clipart-design-free-png.png"),
    Category("Chinese", "https://cdn-icons-png.flaticon.com/512/10933/10933031.png"),
    Category("Italian", "https://static.vecteezy.com/system/resources/previews/027/931/960/non_2x/italian-food-pasta-noodle-illustration-free-png.png"),
    Category("Mexican", "https://static.vecteezy.com/system/resources/previews/013/391/996/non_2x/tasco-mexican-food-png.png"),
    Category("Indian", "https://static.vecteezy.com/system/resources/previews/044/764/882/non_2x/tikka-masala-curry-chicken-served-over-rice-in-bowl-traditional-indian-food-png.png")
)

val restaurants = listOf(
    Restaurant("Burger King", "https://logos-marcas.com/wp-content/uploads/2020/08/Burger-King-Logo.png"),
    Restaurant("McDonald's", "https://static.vecteezy.com/system/resources/thumbnails/019/909/624/small/mcdonald-s-transparent-mcdonald-s-free-free-png.png"),
    Restaurant("KFC", "https://pngimg.com/d/kfc_PNG53.png"),
    Restaurant("Pizza Hut", "https://upload.wikimedia.org/wikipedia/sco/thumb/d/d2/Pizza_Hut_logo.svg/2177px-Pizza_Hut_logo.svg.png"),
    Restaurant("Subway", "https://foodbrandlogo.com/wp-content/uploads/2024/12/Subway-logo-1024x580.webp")
)

val foods = listOf(
    Food("Cheeseburger", "https://groundbeefrecipes.com/wp-content/uploads/double-bacon-cheeseburger-recipe-6.jpg", 4.5f, 5.99),
    Food("Sweet and Sour Chicken", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTWCmhg6uu9a_oKg7_HT8m5eqlXbz7POWYM2w&s", 4.7f, 7.99),
    Food("Pizza Margherita", "https://assets.tmecosys.com/image/upload/t_web767x639/img/recipe/ras/Assets/5802fab5-fdce-468a-a830-43e8001f5a72/Derivates/c00dc34a-e73d-42f0-a86e-e2fd967d33fe.jpg", 4.8f, 9.99),
    Food("Tacos", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/001_Tacos_de_carnitas%2C_carne_asada_y_al_pastor.jpg/800px-001_Tacos_de_carnitas%2C_carne_asada_y_al_pastor.jpg", 4.3f, 3.99),
    Food("Butter Chicken", "https://www.recipetineats.com/tachyon/2019/01/Butter-Chicken_5-SQ.jpg?resize=500%2C375", 4.6f, 8.49)
)