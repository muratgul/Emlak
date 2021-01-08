package com.muratgul.emlak.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.muratgul.emlak.R
import com.muratgul.emlak.model.*
import com.muratgul.emlak.adapter.FlatsAdapter
import com.muratgul.emlak.adapter.HouseAdapter
import com.muratgul.emlak.adapter.RecomAdapter
import kotlinx.android.synthetic.main.first_fragment.*

class FirstFragment : Fragment(R.layout.first_fragment) {

    private val myAdapterFlats = FlatsAdapter()
    private val myAdapterHouse = HouseAdapter()
    private val myAdapterRecom = RecomAdapter()
    var flatsList = ArrayList<FlatsModel>()
    var houseList = ArrayList<HouseModel>()
    var recomList = ArrayList<RecommendedModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imageView2.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToListFragment()
            Navigation.findNavController(it).navigate(action)

        }

        recyclerViewTopFlats.adapter = myAdapterFlats
        recyclerViewTopFlats.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        recyclerViewRecommended.adapter = myAdapterRecom
        recyclerViewRecommended.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        recyclerViewTopHouses.adapter = myAdapterHouse
        recyclerViewTopHouses.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        flatsList.add(FlatsModel(R.drawable.flat1))
        flatsList.add(FlatsModel(R.drawable.flat2))
        flatsList.add(FlatsModel(R.drawable.flat3))

        houseList.add(HouseModel(R.drawable.hs1))
        houseList.add(HouseModel(R.drawable.hs2))
        houseList.add(HouseModel(R.drawable.hs3))

        recomList.add(RecommendedModel(R.drawable.recom1))
        recomList.add(RecommendedModel(R.drawable.recom2))
        recomList.add(RecommendedModel(R.drawable.recom3))

        myAdapterFlats.setData(flatsList)
        myAdapterHouse.setData(houseList)
        myAdapterRecom.setData(recomList)
    }



}