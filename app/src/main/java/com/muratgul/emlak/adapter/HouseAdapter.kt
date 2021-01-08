package com.muratgul.emlak.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muratgul.emlak.R
import com.muratgul.emlak.model.HouseModel
import kotlinx.android.synthetic.main.recycler_home_item.view.*

class HouseAdapter: RecyclerView.Adapter<HouseAdapter.HouseViewHolder>() {

    private var myList = emptyList<HouseModel>()

    class HouseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HouseViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycler_home_item, parent, false)
        return HouseViewHolder(view)
    }

    override fun onBindViewHolder(holder: HouseViewHolder, position: Int) {
        holder.itemView.imageRecyclerView.setImageResource(myList[position].id)
    }

    override fun getItemCount(): Int {
        return myList.size
    }

    fun setData(list: List<HouseModel>){
        myList = list
        notifyDataSetChanged()
    }

}