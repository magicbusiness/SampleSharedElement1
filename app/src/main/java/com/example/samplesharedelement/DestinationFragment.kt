package com.example.samplesharedelement

import android.os.Bundle
import android.transition.TransitionInflater
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A simple [Fragment] subclass.
 * Use the [DestinationFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DestinationFragment : Fragment()
{
     override fun onCreate(savedInstanceState: Bundle?)
     {
        super.onCreate(savedInstanceState)

         val animations_open = TransitionInflater.from(requireContext()).inflateTransition(android.R.transition.move)
         val animations_close = TransitionInflater.from(requireContext()).inflateTransition(android.R.transition.move)

         sharedElementEnterTransition = animations_open
         sharedElementReturnTransition = animations_close
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_destination, container, false)
    }
}