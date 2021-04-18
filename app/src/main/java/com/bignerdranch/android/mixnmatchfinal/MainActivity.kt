package com.bignerdranch.android.mixnmatchfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), Medium_Selection.Callbacks {
    private lateinit var book: Book
    private lateinit var movie: Movie
    private lateinit var tv: TV

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)
        if (currentFragment == null) {
            val fragment = Medium_Selection.newInstance()
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit()
        }
        book = Book()
        movie = Movie()
        tv = TV()
    }

    override fun onMediumSelected(string: String) {
        when (string) {
            "book" -> {
                val fragment = Genre_Selection()
                book.isChosen = true
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit()
            }
            "movie" -> {
                val fragment = Genre_Selection()
                movie.isChosen = true
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit()
            }
            "tv" -> {
                val fragment = Genre_Selection()
                tv.isChosen = true
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit()
            }
        }

    }

}