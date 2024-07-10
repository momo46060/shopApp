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
    @SerialName("rating")
    val rating:Rating
)

@Serializable
data class Rating(
    val rate:Float = 0.0f,
    val count:Int = 0
)
