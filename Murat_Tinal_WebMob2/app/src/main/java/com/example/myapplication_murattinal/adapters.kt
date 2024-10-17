package com.example.myapplication_murattinal.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication_murattinal.Post
import com.example.myapplication_murattinal.R

class PostAdapter(private val posts: List<Post>) : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val postImage: ImageView = itemView.findViewById(R.id.post_image)
        val usernameTextView: TextView = itemView.findViewById(R.id.username)
        val captionTextView: TextView = itemView.findViewById(R.id.caption)
        val likesTextView: TextView = itemView.findViewById(R.id.likes)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_post, parent, false)
        return PostViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = posts[position]

        holder.usernameTextView.text = post.username

    }

    override fun getItemCount(): Int {
        return posts.size
    }
}
