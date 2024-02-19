package com.example.bootcamp_odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bootcamp_odev4.databinding.FragmentAnasayfaBinding
import com.example.bootcamp_odev4.databinding.FragmentSayfaYBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding : FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.apply {
            buttonA.setOnClickListener {
                val action = AnasayfaFragmentDirections.actionAnasayfaFragmentToSayfaAFragment()
                findNavController().navigate(action)
            }

            buttonX.setOnClickListener {
                val action = AnasayfaFragmentDirections.actionAnasayfaFragmentToSayfaXFragment()
                findNavController().navigate(action)
            }
        }

        return binding.root
    }
}