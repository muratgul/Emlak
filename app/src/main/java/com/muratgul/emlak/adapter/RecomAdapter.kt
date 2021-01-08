package com.muratgul.emlak.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muratgul.emlak.R
import com.muratgul.emlak.model.RecommendedModel
import kotlinx.android.synthetic.main.recycler_home_item.view.*

class RecomAdapter : RecyclerView.Adapter<RecomAdapter.RecomViewHolder>() {

    private var myList = emptyList<RecommendedModel>()

    class RecomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecomViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycler_home_item, parent, false)
        return RecomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecomViewHolder, position: Int) {
        holder.itemView.imageRecyclerView.setImageResource(myList[position].id)
    }

    override fun getItemCount(): Int {
        return myList.size
    }

    fun setData(list: List<RecommendedModel>){
        myList = list
        notifyDataSetChanged()
    }

}