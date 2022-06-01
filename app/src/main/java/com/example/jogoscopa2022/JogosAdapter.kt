package com.example.jogoscopa2022

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jogoscopa2022.model.Jogo
import com.example.jogoscopa2022.model.fakeJogos

class JogosAdapter: RecyclerView.Adapter<JogosAdapter.JogosViewHolder>() {

    var jogos = fakeJogos()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JogosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.jogo, parent,false)
        return JogosViewHolder(view)
    }

    override fun onBindViewHolder(holder: JogosViewHolder, position: Int) {
        holder.bind(jogos[position])
    }

    override fun getItemCount() = jogos.size

    inner class JogosViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(jogo: Jogo){
            itemView.findViewById<TextView>(R.id.txt_jogo).text = jogo.numeroJogo
            itemView.findViewById<TextView>(R.id.txt_name_1).text = jogo.nameTime1
            itemView.findViewById<TextView>(R.id.txt_name_2).text = jogo.nameTime2
            itemView.findViewById<TextView>(R.id.txt_gols_1).text = jogo.golsTime1.toString()
            itemView.findViewById<TextView>(R.id.txt_gols_2).text = jogo.golsTime2.toString()
            jogo.imageTime1?.let {
                itemView.findViewById<ImageView>(R.id.image_time_1).setImageResource(
                    it
                )
            }
            jogo.imageTime2?.let {
                itemView.findViewById<ImageView>(R.id.image_time_2).setImageResource(
                    it
                )
            }

            // mudando a cor dos textos de acordo com o resultado
            when {
                jogo.golsTime1 > jogo.golsTime2 -> {
                    itemView.findViewById<TextView>(R.id.txt_gols_1).setTextColor(Color.rgb(0,240,0))
                }
                jogo.golsTime1 == jogo.golsTime2 -> {
                    itemView.findViewById<TextView>(R.id.txt_gols_1).setTextColor(Color.rgb(240,0,0))
                    itemView.findViewById<TextView>(R.id.txt_gols_2).setTextColor(Color.rgb(240,0,0))
                }
                else -> {
                    itemView.findViewById<TextView>(R.id.txt_gols_2).setTextColor(Color.rgb(0,240,0))
                }
            }
        }
    }
}
