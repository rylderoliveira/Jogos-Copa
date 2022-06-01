package com.example.jogoscopa2022.model

import com.example.jogoscopa2022.R

data class Jogo(
    val numeroJogo: String,
    val time1: Time?,
    val time2: Time?,
    var golsTime1: Int,
    var golsTime2: Int,
)

class JogoBuilder {
    var numeroJogo: String = ""
    var time1: Time? = null
    var time2: Time? = null
    var golsTime1: Int = 0
    var golsTime2: Int = 0

    fun build(): Jogo = Jogo(numeroJogo,time1,time2,golsTime1,golsTime2)
}

fun novoJogo(block: JogoBuilder.() -> Unit): Jogo = JogoBuilder().apply(block).build()

val times = geraTimes()

fun fakeJogos(): MutableList<Jogo> = mutableListOf(
    novoJogo {
        numeroJogo = "Jogo 1"
        time1 = times[0]
        time2 = times[1]
        golsTime1 = 1
        golsTime2 = 2
    },
    novoJogo {
        numeroJogo = "Jogo 2"
        time1 = times[1]
        time2 = times[2]
        golsTime1 = 3
        golsTime2 = 2
    },
    novoJogo {
        numeroJogo = "Jogo 3"
        time1 = times[2]
        time2 = times[3]
        golsTime1 = 1
        golsTime2 = 4
    },
    novoJogo {
        numeroJogo = "Jogo 4"
        time1 = times[3]
        time2 = times[4]
        golsTime1 = 1
        golsTime2 = 1
    },
    novoJogo {
        numeroJogo = "Jogo 5"
        time1 = times[4]
        time2 = times[0]
        golsTime1 = 0
        golsTime2 = 0
    },
    novoJogo {
        numeroJogo = "Jogo 6"
        time1 = times[4]
        time2 = times[2]
        golsTime1 = 5
        golsTime2 = 2
    },
    novoJogo {
        numeroJogo = "Jogo 7"
        time1 = times[3]
        time2 = times[1]
        golsTime1 = 2
        golsTime2 = 6
    },
)
