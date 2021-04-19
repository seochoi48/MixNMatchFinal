package com.bignerdranch.android.mixnmatchfinal

import android.R.attr.key
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.bignerdranch.android.mixnmatchfinal.Medium_Selection as Medium_Selection1




class Medium_Selection : Fragment() {
    private lateinit var book: Book
    private lateinit var movie: Movie
    private lateinit var tv: TV
    private lateinit var recommendbook: Button
    private lateinit var recommendmovie: Button
    private lateinit var recommendTV: Button
    private lateinit var mediumPressed: String

    interface Callbacks {
        fun onMediumSelected(string: String)
    }

    private var callbacks: Callbacks? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        book=Book()
        movie=Movie()
        tv=TV()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        callbacks = context as Callbacks?
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_medium__selection, container, false)
        recommendbook = view.findViewById(R.id.recommend_book_button)
        recommendmovie = view.findViewById(R.id.recommend_movie_button)
        recommendTV = view.findViewById(R.id.recommend_tv_button)

        recommendbook.setOnClickListener {
            mediumPressed = "book"
            callbacks?.onMediumSelected(mediumPressed)
        }

        recommendmovie.setOnClickListener {
            mediumPressed = "movie"
            callbacks?.onMediumSelected(mediumPressed)
        }

        recommendTV.setOnClickListener {
            mediumPressed = "tv"
            callbacks?.onMediumSelected(mediumPressed)
        }


        return view

    }



    override fun onDetach() {
        super.onDetach()
        callbacks = null
    }


    companion object {
        fun newInstance(): com.bignerdranch.android.mixnmatchfinal.Medium_Selection{
           return com.bignerdranch.android.mixnmatchfinal.Medium_Selection()
        }
    }



}


