package com.example.bootcamp_odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bootcamp_odev4.databinding.FragmentSayfaBBinding
import com.example.bootcamp_odev4.databinding.FragmentSayfaXBinding

class SayfaXFragment : Fragment() {
    private lateinit var binding : FragmentSayfaXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSayfaXBinding.inflate(inflater, container, false)

        binding.buttonnY.setOnClickListener {
            val action=SayfaXFragmentDirections.actionSayfaXFragmentToSayfaYFragment()
            findNavController().navigate(action)
        }

        return binding.root
    }
}