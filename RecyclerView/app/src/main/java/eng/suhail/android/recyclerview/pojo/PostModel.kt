package eng.suhail.android.recyclerview.pojo

class PostModel {
    var userId = 0
    var id = 0
    var title: String? = null
    var body: String? = null
    @JvmName("getUserId1")
    fun getUserId(): Int {
        return userId
    }
    @JvmName("setUserId1")
    fun setUserId(userId: Int) {
        this.userId = userId
    }

    @JvmName("getId1")
    fun getId(): Int {
        return id
    }

    @JvmName("setId1")
    fun setId(id: Int) {
        this.id = id
    }

    @JvmName("getTitle1")
    fun getTitle(): String? {
        return title
    }

    @JvmName("setTitle1")
    fun setTitle(title: String?) {
        this.title = title
    }

    @JvmName("getBody1")
    fun getBody(): String? {
        return body
    }

    @JvmName("setBody1")
    fun setBody(body: String?) {
        this.body = body
    }
}