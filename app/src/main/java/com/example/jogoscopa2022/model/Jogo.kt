package com.example.jogoscopa2022.model

import com.example.jogoscopa2022.R

data class Jogo(
    val numeroJogo: String,
    val nameTime1: String,
    val nameTime2: String,
    var golsTime1: Int,
    var golsTime2: Int,
    val imageTime1: Int?,
    val imageTime2: Int?,
)

class JogoBuilder {
    var numeroJogo: String = ""
    var nameTime1: String = ""
    var nameTime2: String = ""
    var golsTime1: Int = 0
    var golsTime2: Int = 0
    var imageTime1: Int? = null
    var imageTime2: Int? = null

    fun build(): Jogo = Jogo(numeroJogo,nameTime1,nameTime2,golsTime1,golsTime2,imageTime1,imageTime2)
}

fun novoJogo(block: JogoBuilder.() -> Unit): Jogo = JogoBuilder().apply(block).build()

fun fakeJogos(): MutableList<Jogo> = mutableListOf(
    novoJogo {
        numeroJogo = "Jogo 1"
        nameTime1 = "Cruzeiro"
        nameTime2 = "Atletico"
        golsTime1 = 1
        golsTime2 = 2
        imageTime1 = R.drawable.cruzeiro
        imageTime2 = R.drawable.atletico
    },
    novoJogo {
        numeroJogo = "Jogo 2"
        nameTime1 = "Cruzeiro"
        nameTime2 = "Internacional"
        golsTime1 = 3
        golsTime2 = 2
        imageTime1 = R.drawable.cruzeiro
        imageTime2 = R.drawable.internacional
    },
    novoJogo {
        numeroJogo = "Jogo 3"
        nameTime1 = "Atletico"
        nameTime2 = "Santos"
        golsTime1 = 1
        golsTime2 = 4
        imageTime1 = R.drawable.atletico
        imageTime2 = R.drawable.santos
    },
    novoJogo {
        numeroJogo = "Jogo 4"
        nameTime1 = "Internacional"
        nameTime2 = "Corinthians"
        golsTime1 = 1
        golsTime2 = 1
        imageTime1 = R.drawable.internacional
        imageTime2 = R.drawable.corinthians
    },
    novoJogo {
        numeroJogo = "Jogo 5"
        nameTime1 = "Corinthians"
        nameTime2 = "Atletico"
        golsTime1 = 0
        golsTime2 = 0
        imageTime1 = R.drawable.corinthians
        imageTime2 = R.drawable.atletico
    },
    novoJogo {
        numeroJogo = "Jogo 6"
        nameTime1 = "Cruzeiro"
        nameTime2 = "Internacional"
        golsTime1 = 5
        golsTime2 = 2
        imageTime1 = R.drawable.cruzeiro
        imageTime2 = R.drawable.internacional
    },
    novoJogo {
        numeroJogo = "Jogo 7"
        nameTime1 = "Santos"
        nameTime2 = "Internacional"
        golsTime1 = 2
        golsTime2 = 6
        imageTime1 = R.drawable.santos
        imageTime2 = R.drawable.internacional
    },
)
