package com.bignerdranch.android.mixnmatchfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), Medium_Selection.Callbacks, passOnData {

    private lateinit var book : Book

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
    }

    //replaces the fragment to instantized Genre selection with the correct medium instantizer
    override fun onMediumSelected(string: String) {
        when (string) {
            "book" -> {
                val fragment = GenreSelection.newInstance("book")
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit()
            }
            "movie" -> {
                val fragment = GenreSelection.newInstance("movie")
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit()
            }
            "tv" -> {
                val fragment = GenreSelection.newInstance("tv")
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit()
            }
        }

    }

    //sets the book
    override fun bookPass(data: Book) {
        book = data
    }

}