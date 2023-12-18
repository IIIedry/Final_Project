package com.example.shop.data.order

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Address(
    val addressTitle: String,
    val fullName: String,
    val street: String,
    val phone: String,
    val city: String,
    val state: String
): Parcelable {

    constructor(): this("","","","","","")
}
//    constructor(): this("","IIIedry King","Abai 45A","+77471664865","Taraz","Kazakhstan")
//}