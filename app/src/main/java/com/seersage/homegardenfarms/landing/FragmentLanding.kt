package com.seersage.homegardenfarms.landing

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.seersage.homegardenfarms.R
import com.seersage.homegardenfarms.databinding.FragmentLandingBinding


class FragmentLanding : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentLandingBinding>(inflater,
            R.layout.fragment_landing,container,false)
        return binding.root
    }
}
