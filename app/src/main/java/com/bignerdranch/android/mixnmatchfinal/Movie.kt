package com.bignerdranch.android.mixnmatchfinal

import java.util.*

data class Movie (val id: UUID = UUID.randomUUID(),
                  var title: String = "",
                  var description: String = "",
                  var isSeen: Boolean = false) {
    var isAction = false
    var isAnimation = false
    var isComedy = false
    var isDrama = false
    var isFantasy = false
    var isHistorical = false
    var isHorror = false
    var isRomance = false
    var isSciFi = false
    var isThriller = false
    var isWestern = false
    var isChosen = false
}