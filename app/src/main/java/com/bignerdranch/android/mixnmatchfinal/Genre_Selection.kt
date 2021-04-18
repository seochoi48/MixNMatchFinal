package com.bignerdranch.android.mixnmatchfinal

import android.R.attr.defaultValue
import android.R.attr.key
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.fragment.app.Fragment


class Genre_Selection : Fragment() {
    private lateinit var book: Book
    private lateinit var movie: Movie
    private lateinit var tv: TV
    private lateinit var actionCheckBox: CheckBox
    private lateinit var animationCheckBox: CheckBox
    private lateinit var comedyCheckBox: CheckBox
    private lateinit var dramaCheckBox: CheckBox
    private lateinit var fantasyCheckBox: CheckBox
    private lateinit var historicalCheckBox: CheckBox
    private lateinit var horrorCheckBox: CheckBox
    private lateinit var romanceCheckBox: CheckBox
    private lateinit var sciFiCheckBox: CheckBox
    private lateinit var thrillerCheckBox: CheckBox
    private lateinit var westernCheckBox: CheckBox
    private lateinit var clearButton: Button
    private lateinit var confirmButton: Button
    private lateinit var mediumSelected: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        book = Book()
        movie = Movie()
        tv = TV()
        mediumSelected = ""
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_genre__selection, container, false)
        actionCheckBox = view.findViewById(R.id.Action_check)
        animationCheckBox = view.findViewById(R.id.Animation_check)
        comedyCheckBox = view.findViewById(R.id.Comedy_check)
        dramaCheckBox = view.findViewById(R.id.Drama_check)
        fantasyCheckBox = view.findViewById(R.id.Fantasy_check)
        historicalCheckBox = view.findViewById(R.id.Historical_check)
        horrorCheckBox = view.findViewById(R.id.Horror_check)
        romanceCheckBox = view.findViewById(R.id.Romance_check)
        sciFiCheckBox = view.findViewById(R.id.Sci_Fi_check)
        thrillerCheckBox = view.findViewById(R.id.Thriller_check)
        westernCheckBox = view.findViewById(R.id.Western_check)
        clearButton = view.findViewById(R.id.Clear_all)
        confirmButton = view.findViewById(R.id.Confirm_genre)

        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        arguments?.getString("Which medium pressed")?.let {
            mediumSelected = it
        }
    }

    override fun onStart() {
        super.onStart()
        when (mediumSelected) {
            "book" -> {
                Toast.makeText(context, R.string.chose_book, Toast.LENGTH_LONG).show()
                actionCheckBox.apply {
                    setOnCheckedChangeListener { _, isChecked ->
                        book.isAction = isChecked
                    }
                }
                animationCheckBox.apply {
                    setOnCheckedChangeListener { _, isChecked ->
                        book.isAnimation = isChecked
                    }
                }
                comedyCheckBox.apply {
                    setOnCheckedChangeListener { _, isChecked ->
                        book.isComedy = isChecked
                    }
                }
                dramaCheckBox.apply {
                    setOnCheckedChangeListener { _, isChecked ->
                        book.isFantasy = isChecked
                    }
                }
                fantasyCheckBox.apply{
                    setOnCheckedChangeListener{ _, isChecked ->
                        book.isFantasy = isChecked
                    }
                }
                historicalCheckBox.apply {
                    setOnCheckedChangeListener{ _, isChecked ->
                        book.isHistorical = isChecked
                    }
                }
                horrorCheckBox.apply {
                    setOnCheckedChangeListener{ _, isChecked ->
                        book.isHorror = isChecked
                    }
                }
                romanceCheckBox.apply {
                    setOnCheckedChangeListener{ _, isChecked ->
                        book.isRomance = isChecked
                    }
                }
                sciFiCheckBox.apply {
                    setOnCheckedChangeListener{ _, isChecked ->
                        book.isSciFi = isChecked
                    }
                }
                thrillerCheckBox.apply {
                    setOnCheckedChangeListener{ _, isChecked ->
                        book.isThriller = isChecked
                    }
                }
                westernCheckBox.apply {
                    setOnCheckedChangeListener{ _, isChecked ->
                        book.isWestern = isChecked
                    }
                }
                clearButton.setOnClickListener {
                    book.isWestern = false
                    book.isThriller = false
                    book.isSciFi = false
                    book.isRomance = false
                    book.isHorror = false
                    book.isHistorical = false
                    book.isFantasy = false
                    book.isChosen = false
                    book.isComedy = false
                    book.isAction = false
                    book.isDrama = false
                }
            }
            "movie" -> {
                Toast.makeText(context, "Chose Movie", Toast.LENGTH_LONG).show()
                actionCheckBox.apply {
                    setOnCheckedChangeListener { _, isChecked ->
                        movie.isAction = isChecked
                    }
                }
                animationCheckBox.apply {
                    setOnCheckedChangeListener { _, isChecked ->
                        movie.isAnimation = isChecked
                    }
                }
                comedyCheckBox.apply {
                    setOnCheckedChangeListener { _, isChecked ->
                        movie.isComedy = isChecked
                    }
                }
                dramaCheckBox.apply {
                    setOnCheckedChangeListener { _, isChecked ->
                        movie.isFantasy = isChecked
                    }
                }
                fantasyCheckBox.apply{
                    setOnCheckedChangeListener{ _, isChecked ->
                        movie.isFantasy = isChecked
                    }
                }
                historicalCheckBox.apply {
                    setOnCheckedChangeListener{ _, isChecked ->
                        movie.isHistorical = isChecked
                    }
                }
                horrorCheckBox.apply {
                    setOnCheckedChangeListener{ _, isChecked ->
                        movie.isHorror = isChecked
                    }
                }
                romanceCheckBox.apply {
                    setOnCheckedChangeListener{ _, isChecked ->
                        movie.isRomance = isChecked
                    }
                }
                sciFiCheckBox.apply {
                    setOnCheckedChangeListener{ _, isChecked ->
                        movie.isSciFi = isChecked
                    }
                }
                thrillerCheckBox.apply {
                    setOnCheckedChangeListener{ _, isChecked ->
                        movie.isThriller = isChecked
                    }
                }
                westernCheckBox.apply {
                    setOnCheckedChangeListener{ _, isChecked ->
                        movie.isWestern = isChecked
                    }
                }
                clearButton.setOnClickListener {
                    movie.isWestern = false
                    movie.isThriller = false
                    movie.isSciFi = false
                    movie.isRomance = false
                    movie.isHorror = false
                    movie.isHistorical = false
                    movie.isFantasy = false
                    movie.isChosen = false
                    movie.isComedy = false
                    movie.isAction = false
                    movie.isDrama = false
                }
            }
            "tv" -> {
                Toast.makeText(context, "Chose TV", Toast.LENGTH_LONG).show()
                actionCheckBox.apply {
                    setOnCheckedChangeListener { _, isChecked ->
                        tv.isAction = isChecked
                    }
                }
                animationCheckBox.apply {
                    setOnCheckedChangeListener { _, isChecked ->
                        tv.isAnimation = isChecked
                    }
                }
                comedyCheckBox.apply {
                    setOnCheckedChangeListener { _, isChecked ->
                        tv.isComedy = isChecked
                    }
                }
                dramaCheckBox.apply {
                    setOnCheckedChangeListener { _, isChecked ->
                        tv.isFantasy = isChecked
                    }
                }
                fantasyCheckBox.apply{
                    setOnCheckedChangeListener{ _, isChecked ->
                        tv.isFantasy = isChecked
                    }
                }
                historicalCheckBox.apply {
                    setOnCheckedChangeListener{ _, isChecked ->
                        tv.isHistorical = isChecked
                    }
                }
                horrorCheckBox.apply {
                    setOnCheckedChangeListener{ _, isChecked ->
                        tv.isHorror = isChecked
                    }
                }
                romanceCheckBox.apply {
                    setOnCheckedChangeListener{ _, isChecked ->
                        tv.isRomance = isChecked
                    }
                }
                sciFiCheckBox.apply {
                    setOnCheckedChangeListener{ _, isChecked ->
                        tv.isSciFi = isChecked
                    }
                }
                thrillerCheckBox.apply {
                    setOnCheckedChangeListener{ _, isChecked ->
                        tv.isThriller = isChecked
                    }
                }
                westernCheckBox.apply {
                    setOnCheckedChangeListener{ _, isChecked ->
                        tv.isWestern = isChecked
                    }
                }
                clearButton.setOnClickListener {
                    tv.isWestern = false
                    tv.isThriller = false
                    tv.isSciFi = false
                    tv.isRomance = false
                    tv.isHorror = false
                    tv.isHistorical = false
                    tv.isFantasy = false
                    tv.isChosen = false
                    tv.isComedy = false
                    tv.isAction = false
                    tv.isDrama = false
                }
            }

        }
    }

    companion object {
        fun newInstance(): Genre_Selection {
            return Genre_Selection()
        }
    }
}