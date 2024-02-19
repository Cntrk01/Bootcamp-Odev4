package com.example.bootcamp_odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bootcamp_odev4.databinding.FragmentSayfaABinding


class SayfaAFragment : Fragment() {
    private lateinit var binding : FragmentSayfaABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentSayfaABinding.inflate(inflater, container, false)

        binding.buttonB.setOnClickListener {
            val action=SayfaAFragmentDirections.actionSayfaAFragmentToSayfaBFragment()
            findNavController().navigate(action)
        }

        return binding.root
    }
}