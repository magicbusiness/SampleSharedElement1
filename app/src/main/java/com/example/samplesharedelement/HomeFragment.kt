package com.example.samplesharedelement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        val sample_image: ImageView = view.findViewById(R.id.sample_image)

        sample_image.setOnClickListener {
            val share = FragmentNavigatorExtras(sample_image to "imageBig")
            findNavController().navigate(R.id.home_to_destination, null, null, share)
        }

        // Inflate the layout for this fragment
        return view
    }
}