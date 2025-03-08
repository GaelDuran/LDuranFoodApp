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
    Category("Fast Food", "https://static.vecteezy.com/system/resources/previews/000/964/198/non_2x/fast-food-meal-set-vector.jpg"),
    Category("Chinese", "https://static.vecteezy.com/system/resources/previews/004/596/197/non_2x/noodle-with-meatball-and-shrimp-in-box-chinese-food-cartoon-flat-illustration-vector.jpg"),
    Category("Italian", "https://img.freepik.com/premium-vector/pasta-dish-cartoon-icon-italian-food-plate_80590-14812.jpg"),
    Category("Mexican", "https://img.freepik.com/premium-vector/delicious-mexican-food-cartoon_24640-30850.jpg"),
    Category("Indian", "https://static.vecteezy.com/system/resources/previews/009/668/715/non_2x/indian-food-cartoon-illustration-with-various-collection-of-delicious-traditional-cuisine-dishes-in-flat-style-design-vector.jpg")
)

val restaurants = listOf(
    Restaurant("Burger King", "https://logos-marcas.com/wp-content/uploads/2020/08/Burger-King-Logo.png"),
    Restaurant("McDonald's", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTyxGkERWKzkzO29bkKeuKMeGYuPku5Dcq-7w&s"),
    Restaurant("KFC", "https://e7.pngegg.com/pngimages/651/153/png-clipart-kfc-logo-kfc-logo-icons-logos-emojis-iconic-brands-thumbnail.png"),
    Restaurant("Pizza Hut", "https://upload.wikimedia.org/wikipedia/sco/thumb/d/d2/Pizza_Hut_logo.svg/2177px-Pizza_Hut_logo.svg.png"),
    Restaurant("Subway", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRABXCBOTdzAA44UoXDkGCdLFgFDkUszjSULg&s")
)

val foods = listOf(
    Food("Cheeseburger", "https://upload.wikimedia.org/wikipedia/commons/4/4d/Cheeseburger.jpg", 4.5f, 5.99),
    Food("Sweet and Sour Chicken", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTWCmhg6uu9a_oKg7_HT8m5eqlXbz7POWYM2w&s", 4.7f, 7.99),
    Food("Pizza Margherita", "https://assets.tmecosys.com/image/upload/t_web767x639/img/recipe/ras/Assets/5802fab5-fdce-468a-a830-43e8001f5a72/Derivates/c00dc34a-e73d-42f0-a86e-e2fd967d33fe.jpg", 4.8f, 9.99),
    Food("Tacos", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/001_Tacos_de_carnitas%2C_carne_asada_y_al_pastor.jpg/800px-001_Tacos_de_carnitas%2C_carne_asada_y_al_pastor.jpg", 4.3f, 3.99),
    Food("Butter Chicken", "https://www.recipetineats.com/tachyon/2019/01/Butter-Chicken_5-SQ.jpg?resize=500%2C375", 4.6f, 8.49)
)