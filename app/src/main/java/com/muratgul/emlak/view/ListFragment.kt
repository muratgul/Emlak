package com.muratgul.emlak.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.muratgul.emlak.R
import com.muratgul.emlak.adapter.ListAdapter
import com.muratgul.emlak.model.ListModel
import kotlinx.android.synthetic.main.list_fragment.*

class ListFragment : Fragment(R.layout.list_fragment) {

    var dataList = ArrayList<ListModel>()
    private val myAdapter = ListAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nevLeft.setOnClickListener {
            val action = ListFragmentDirections.actionListFragmentToFirstFragment()
            Navigation.findNavController(it).navigate(action)
        }

        dataList.add(ListModel(R.drawable.list1, "Rose Villa", "Koramangala,Banglore", "8k", 120, 990))
        dataList.add(ListModel(R.drawable.list2, "Blue House", "Indiranagar,Banglore", "11k", 100, 560))
        dataList.add(ListModel(R.drawable.list3, "Ocean Villa", "M.G. Road,Banglore", "6k", 25, 470))
        dataList.add(ListModel(R.drawable.list4, "Calp Flat", "HSR Layout,Banglore", "12k", 75, 580))
        dataList.add(ListModel(R.drawable.list5, "Radison Room", "Richmond Town,Banglore", "7k", 91, 351))
        dataList.add(ListModel(R.drawable.list6, "Dexico House", "Jayanagar,Bnaglore", "7k", 35, 712))

        litRecyclerView.adapter = myAdapter
        litRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        litRecyclerView.addItemDecoration(
            DividerItemDecoration(
                context,
                LinearLayoutManager.VERTICAL
            )
        )

        myAdapter.setData(dataList)



    }
}