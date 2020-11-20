package eng.suhail.android.recyclerview.data

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import eng.suhail.android.PostsClient
import eng.suhail.android.pojo.PostModel
import eng.suhail.android.recyclerview.pojo.PostModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class PostViewModel : ViewModel() {
    var postsMutableLiveData = MutableLiveData<List<PostModel>>()
    var posts = MutableLiveData<String>()

    constructor(
        postsMutableLiveData: MutableLiveData<List<PostModel>>,
        posts: MutableLiveData<String>
    ) : super() {
        this.postsMutableLiveData = postsMutableLiveData
        this.posts = posts
    }

    fun getPosts() {
        PostsClient.getINSTANCE().getPosts().enqueue(object : Callback<List<PostModel>> {

            override fun onResponse(
                call: Call<List<PostModel>>,
                response: Response<List<PostModel>>
            ) {
                postsMutableLiveData.setValue(response.body())
            }

            override fun onFailure(call: Call<List<PostModel>>, t: Throwable) {
                posts.setValue("errr")
            }
        })
    }


}

