package data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Product(
    @SerialName("id")
    val id:Int? = null,
    @SerialName("title")
    val title:String? = null,
    @SerialName("price")
    val price:Double? = null,
    @SerialName("description")
    val description:String? = null,
    @SerialName("image")
    val image:String? = null,
//    val rating:Rating
)

@Serializable
data class Rating(
    val rate:Int = 0,
    val count:Int = 0
)
