package com.bignerdranch.android.mixnmatchfinal

//interface to pass on data from Genre selection fragment to main activity
interface passOnData {
    fun bookPass(data: Book)
    fun moviePass(data: Movie)
    fun tvPass(data: TV)

}