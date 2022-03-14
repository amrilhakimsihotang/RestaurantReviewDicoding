package id.amrilhs.restaurantreviewdicoding

import com.google.gson.annotations.SerializedName

data class RestaurantResponse(
	val restaurant: Restaurant? = null,
	val error: Boolean? = null,
	val message: String? = null
)

data class Restaurant(
	val customerReviews: List<CustomerReviewsItem?>? = null,
	val pictureId: String? = null,
	val name: String? = null,
	val rating: Double? = null,
	val description: String? = null,
	val id: String? = null
)

data class CustomerReviewsItem(
	val date: String? = null,
	val review: String? = null,
	val name: String? = null
)

data class PostReviewResponse(

	@field:SerializedName("customerReviews")
	val customerReviews: List<CustomerReviewsItem>,

	@field:SerializedName("error")
	val error: Boolean,

	@field:SerializedName("message")
	val message: String
)