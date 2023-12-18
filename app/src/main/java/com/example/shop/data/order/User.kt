package com.example.shop.data.order

data class User(
    val firstName: String,
    val lastName: String,
    val email: String,
    var imagePath: String = ""
){
    constructor(): this("IIIedry","King","Iliyas@mail.ru","")
}
