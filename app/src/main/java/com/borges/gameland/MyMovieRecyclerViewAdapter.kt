package com.borges.gameland

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.borges.gameland.dummy.DummyContentMovies.DummyItem
import com.bumptech.glide.Glide

class MyMovieRecyclerViewAdapter(
    private val context: RecyclerView,
    private val values: List<DummyItem>
) : RecyclerView.Adapter<MyMovieRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_movie, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movies = values[position]
        holder.bind(movies)
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(movies: DummyItem) {
            val contentView: TextView = itemView.findViewById(R.id.content)
            val imgMovie: ImageView = itemView.findViewById(R.id.photo_id)
            contentView.text = movies.content

            Glide
                .with(context)
                .load(movies.photo)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(imgMovie)
        }

    }
}

