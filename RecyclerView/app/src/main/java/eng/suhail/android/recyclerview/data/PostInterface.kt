package eng.suhail.android.recyclerview.data

import eng.suhail.android.recyclerview.pojo.PostModel
import retrofit2.Call
import retrofit2.http.GET


interface PostInterface {
    @get:GET("posts")
    val posts: Call<List<PostModel?>?>?
}