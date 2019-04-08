package com.ziadsyahrul.footballclubkotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_jebret.view.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class JebretAdapter (val context: Context, val items: List<Item>, val listener: (Item) -> Unit) : RecyclerView.Adapter<JebretAdapter.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_jebret, viewGroup, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.bindItems(items[i], listener)
    }

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
        val namaClub = view.tv_nama
        val gambarClub = view.imgClub

        // TODO Membuat function untuk bisa mensetting widgetnya
        fun bindItems (item: Item, listener: (Item) -> Unit) {
            namaClub.text = item.nama
            Glide.with(itemView.context).load(item.gambar).into(gambarClub)
            itemView.onClick {
                listener(item)
            }

        }
    }
}

