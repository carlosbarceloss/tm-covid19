package com.example.covid19

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.date_list.view.*

class ListaAdapter (private val infoData: List<Boletim>): RecyclerView.Adapter<ListaAdapter.VH>() {




    class VH(itemView: View): RecyclerView.ViewHolder(itemView){
        var txtObitos:TextView =itemView.txtObitos
        var txtConfirmados: TextView =itemView.txtConfirmados
        var txtData:TextView =itemView.txtData
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.date_list, parent, false)
        val vh = VH(v)
        return vh
    }

    override fun getItemCount(): Int {
        return infoData.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        var data = infoData[position]
        holder.txtData.text = data.data
        holder.txtObitos.text = data.mortes.toString()
        holder.txtConfirmados.text = data.confirmados.toString()
    }
}