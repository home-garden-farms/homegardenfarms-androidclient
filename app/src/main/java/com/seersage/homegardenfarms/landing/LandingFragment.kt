package com.seersage.homegardenfarms.landing

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.seersage.homegardenfarms.R
import com.seersage.homegardenfarms.databinding.FragmentLandingBinding

class LandingFragment : Fragment() {

    lateinit var binding: FragmentLandingBinding
    private lateinit var viewModel: LandingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentLandingBinding>(inflater,
            R.layout.fragment_landing,container,false)
        //binding.register.setOnClickListener { view: View? ->  }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LandingViewModel::class.java)

    }


}
