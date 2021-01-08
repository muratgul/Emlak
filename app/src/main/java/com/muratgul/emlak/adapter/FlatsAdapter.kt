package com.muratgul.emlak.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muratgul.emlak.R
import com.muratgul.emlak.model.FlatsModel
import kotlinx.android.synthetic.main.recycler_home_item.view.*

class FlatsAdapter : RecyclerView.Adapter<FlatsAdapter.FlatsViewHolder>() {

    private var myList = emptyList<FlatsModel>()

    class FlatsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlatsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycler_home_item, parent, false)
        return FlatsViewHolder(view)
    }

    override fun onBindViewHolder(holder: FlatsViewHolder, position: Int) {
        holder.itemView.imageRecyclerView.setImageResource(myList[position].id)
    }

    override fun getItemCount(): Int {
        return myList.size
    }

    fun setData(list: List<FlatsModel>){
        myList = list
        notifyDataSetChanged()
    }

}