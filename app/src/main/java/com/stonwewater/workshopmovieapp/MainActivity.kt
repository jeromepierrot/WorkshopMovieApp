package com.stonwewater.workshopmovieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.stonwewater.workshopmovieapp.model.Movie
import com.stonwewater.workshopmovieapp.view.adapter.MovieAdapter

class MainActivity : AppCompatActivity() {

    val movieList: List<Movie> = listOf(
        Movie("Bienvenue chez les Ch'tis", android.R.drawable.ic_dialog_email),
        Movie("Avengers", android.R.drawable.ic_dialog_map),
        Movie("Prison Break", android.R.drawable.ic_lock_lock)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_movie)
        val adapter = MovieAdapter(this, getHugeMovieList())
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun getHugeMovieList(): List<Movie> {
        var i = 0
        val list = mutableListOf<Movie>()
        while (i <= 100){
            list.addAll(
                movieList
            )
            i++
        }
        list.add(
            Movie("Fin de liste", android.R.drawable.ic_lock_lock)
        )

        return list
    }
}