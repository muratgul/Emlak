package com.muratgul.emlak.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.muratgul.emlak.R
import kotlinx.android.synthetic.main.detail_fragment.*

class DetailFragment : Fragment(R.layout.detail_fragment) {

    val args: DetailFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        detailTitle.text = args.name
        detailLocation.text = args.location

        detailBackNav.setOnClickListener {
            val action = DetailFragmentDirections.actionDetailFragmentToListFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }

}