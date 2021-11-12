package com.app.recycle_view

import android.content.Context
import android.location.GnssAntennaInfo
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DemonslayerAdapter(private val context: Context, private val demonslayer:List<Demonslayer>, val listener: (Demonslayer) ->Unit)
    :RecyclerView.Adapter<DemonslayerAdapter.demonslayerViewHolder>(){

    class demonslayerViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val  imgDemonslayer = view.findViewById<ImageView>(R.id.img_item_photo)
        val  nameDemonslayer = view.findViewById<TextView>(R.id.tv_item_name)
        val  descDemonslayer = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(demonslayer: Demonslayer, listener: (Demonslayer) -> Unit) {
            imgDemonslayer.setImageResource(demonslayer.imgDemonslayer)
            nameDemonslayer.text = demonslayer.nameDemonslayer
            descDemonslayer.text = demonslayer.descDemonslayer
            itemView.setOnClickListener{
                listener(demonslayer)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): demonslayerViewHolder {
        return demonslayerViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_demonslayer, parent, false)
        )
    }

    override fun onBindViewHolder(holder: demonslayerViewHolder, position: Int) {
        holder.bindView(demonslayer[position], listener)
    }

    override fun getItemCount(): Int = demonslayer.size

    }
