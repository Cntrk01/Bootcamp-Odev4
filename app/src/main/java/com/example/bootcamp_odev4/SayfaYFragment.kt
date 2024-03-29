package com.example.bootcamp_odev4

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.example.bootcamp_odev4.databinding.FragmentSayfaXBinding
import com.example.bootcamp_odev4.databinding.FragmentSayfaYBinding


class SayfaYFragment : Fragment() {
    private lateinit var binding: FragmentSayfaYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaYBinding.inflate(inflater, container, false)

        val geriTusu = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val action = SayfaYFragmentDirections.actionSayfaYFragmentToAnasayfaFragment()
                findNavController().navigate(action)
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, geriTusu)

        return binding.root
    }
}