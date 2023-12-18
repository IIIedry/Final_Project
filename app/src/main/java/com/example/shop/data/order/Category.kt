package com.example.shop.data.order

sealed class Category(val category: String) {

    object Shirts: Category("T-Shirts")
    object Jackets: Category("Jackets")
    object Pants: Category("Pants")
    object Sneakers: Category("Sneakers")
    object Hats: Category("Hats")
}