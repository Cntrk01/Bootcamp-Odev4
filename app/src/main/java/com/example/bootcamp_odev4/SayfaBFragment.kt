package com.example.bootcamp_odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bootcamp_odev4.databinding.FragmentSayfaABinding
import com.example.bootcamp_odev4.databinding.FragmentSayfaBBinding


class SayfaBFragment : Fragment() {
    private lateinit var binding : FragmentSayfaBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSayfaBBinding.inflate(inflater, container, false)

        binding.buttonY.setOnClickListener {
            val action=SayfaBFragmentDirections.actionSayfaBFragmentToSayfaYFragment()
            findNavController().navigate(action)
        }

        return binding.root
    }
}