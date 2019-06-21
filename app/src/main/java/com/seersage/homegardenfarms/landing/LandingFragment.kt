package com.seersage.homegardenfarms.landing

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController

import com.seersage.homegardenfarms.R
import com.seersage.homegardenfarms.databinding.LandingFragmentBinding


class LandingFragment : Fragment() {

    companion object {
        fun newInstance() = LandingFragment()
    }

    private lateinit var viewModel: LandingViewModel
    lateinit var binding: LandingFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.landing_fragment, container, false)
        binding.login.setOnClickListener{view:View -> view.findNavController().navigate(R.id.action_landingFragment_to_loginFragment)}
        binding.register.setOnClickListener{view:View -> view.findNavController().navigate(R.id.action_landingFragment_to_signupFragment)}
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LandingViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
