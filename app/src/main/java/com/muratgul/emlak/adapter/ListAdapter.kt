package com.muratgul.emlak.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.muratgul.emlak.R
import com.muratgul.emlak.model.ListModel
import com.muratgul.emlak.view.ListFragmentDirections
import kotlinx.android.synthetic.main.list_recycler_item.view.*

class ListAdapter : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    private var myList= emptyList<ListModel>()

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_recycler_item, parent, false)
        return ListAdapter.ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.itemView.listItemImage.setImageResource(myList[position].picture)
        holder.itemView.listItemLocation.text = myList[position].location
        holder.itemView.listItemTitle.text = myList[position].name
        holder.itemView.listItemMessageCount.text = myList[position].messageCount.toString()
        holder.itemView.listItemRating.text = myList[position].hearthCount
        holder.itemView.listItemStarsCount.text ="("+myList[position].starCount.toString()+")"

        holder.itemView.listItemImage.setOnClickListener {
            val action = ListFragmentDirections.actionListFragmentToDetailFragment(myList[position].name, myList[position].location)
            Navigation.findNavController(it).navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return myList.size
    }

    fun setData(list: List<ListModel>){
        myList = list
        notifyDataSetChanged()
    }
}