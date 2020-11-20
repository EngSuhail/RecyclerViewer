package eng.suhail.android.recyclerview.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import eng.suhail.android.recyclerview.data.PostsClient
import eng.suhail.android.recyclerview.pojo.PostModel


class PostViewModel : ViewModel() {
    var postsMutableLiveData = MutableLiveData<List<PostModel>>()
    var posts = MutableLiveData<String>()
    fun getPosts() {
        PostsClient.getINSTANCE().getPosts().enqueue(object : Callback<List<PostModel?>?>() {
            fun onResponse(call: Call<List<PostModel?>?>?, response: Response<List<PostModel?>?>) {
                postsMutableLiveData.setValue(response.body())
            }

            fun onFailure(call: Call<List<PostModel?>?>?, t: Throwable?) {
                posts.setValue("errr")
            }
        })
    }
}