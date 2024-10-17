package com.example.myapplication_murattinal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication_murattinal.adapters.PostAdapter

data class Post(val username: String, val location: String, val feed_image: String,
                val status: String, val comment_c: String, val date: String)

class MainActivity : AppCompatActivity() {
    private val postList = mutableListOf<Post>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val newPost = Post("nabam","SHARYN",
            "https://avatars.mds.yandex.net/i?id=3338ceae677bbb373f1a7afc922415fd75f8dcda-9181196-images-thumbs&n=13",
            "Hello, I am Nabat","3", "10/7/2023")
        postList.add(newPost)
        val  newPost2 = Post("msdkd","KZ","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSMdl3HTGdSrPPtE1intiEqAGncJF0-HAyL6VpjWlBNG_wsroaBdglQkhczbEJ6rt5MeCg&usqp=CAU",
            "Hello, I am Madi","8", "18/7/2023")
        postList.add(newPost2)
        val newPost3 = Post("inurzhhh","NIGERIA","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6bQFqMhQmg9hJ-FA5xUUrQidHgQqZC5Nktw&usqp=CAU",
            "Hello, I am Nurzhan","13", "1/7/2023")
        postList.add(newPost3)
        val newPost4 = Post("murattnl","KEGEN","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTaYFjYA4n9jA30XMr0YMswgufCFTDoGO2-f0r1gZakb6badmzDJngUab4bCLGFCGTBAnU&usqp=CAU",
            "Hello, I am Murat ","4", "11/7/2023")
        postList.add(newPost4)
        val newPost5 = Post("murattnl","KEGEN","https://marketplace.canva.com/EAFH_oMBen8/1/0/900w/canva-gray-and-white-asthetic-friend-instagram-story-C5KpyJG5MHA.jpg",
            "Hello, I am Nabat","17", "17/7/2023")

        val recyclerView: RecyclerView = findViewById(R.id.user_posts)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PostAdapter(postList)
    }
}
