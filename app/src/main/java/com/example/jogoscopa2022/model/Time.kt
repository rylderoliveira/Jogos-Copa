package com.example.jogoscopa2022.model

import com.example.jogoscopa2022.R

data class Time(
    val name: String,
    val flagId: Int?,
    val goalsAmount: Int,
    val winSequence: Int,
)

class TimeBuilder {
    var name: String = ""
    var flagId: Int? = null
    var goalsAmount: Int = 0
    var winSequence: Int = 0

    fun build(): Time = Time(name, flagId, goalsAmount, winSequence)
}

fun novoTime(block: TimeBuilder.() -> Unit): Time = TimeBuilder().apply(block).build()

fun geraTimes(): MutableList<Time> = mutableListOf(
    novoTime {
        name = "Cruzeiro"
        flagId = R.drawable.cruzeiro
        goalsAmount = 10
        winSequence = 1
    },
    novoTime {
        name = "Atletico Mineiro"
        flagId = R.drawable.atletico
        goalsAmount = 15
        winSequence = 2
    },
    novoTime {
        name = "Internacional"
        flagId = R.drawable.internacional
        goalsAmount = 3
        winSequence = 0
    },
    novoTime {
        name = "Corinthians"
        flagId = R.drawable.corinthians
        goalsAmount = 16
        winSequence = 3
    },
    novoTime {
        name = "Santos"
        flagId = R.drawable.santos
        goalsAmount = 20
        winSequence = 5
    },
)