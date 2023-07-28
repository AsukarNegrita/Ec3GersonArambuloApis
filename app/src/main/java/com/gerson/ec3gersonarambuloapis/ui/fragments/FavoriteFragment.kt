package com.gerson.ec3gersonarambuloapis.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gerson.ec3gersonarambuloapis.R
import com.gerson.ec3gersonarambuloapis.databinding.FragmentFavoriteBinding
import com.gerson.ec3gersonarambuloapis.databinding.FragmentHomeBinding


class FavoriteFragment : Fragment() {
    private  lateinit var binding: FragmentFavoriteBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentFavoriteBinding.inflate(inflater,container,false)
        return binding.root
    }


}