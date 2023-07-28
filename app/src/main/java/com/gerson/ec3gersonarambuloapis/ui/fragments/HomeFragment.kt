package com.gerson.ec3gersonarambuloapis.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gerson.ec3gersonarambuloapis.R
import com.gerson.ec3gersonarambuloapis.databinding.FragmentFavoriteBinding
import com.gerson.ec3gersonarambuloapis.databinding.FragmentHomeBinding
import com.gerson.ec3gersonarambuloapis.model.getData


class HomeFragment : Fragment() {
    private  lateinit var binding: FragmentHomeBinding
    private  lateinit var viewModel: HomeViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel= ViewModelProvider(requireActivity())[HomeViewModel::class.java]
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter= RVSkinAdapter(listOf())
        binding.rvSkins.adapter= adapter
        binding.rvSkins.layoutManager=GridLayoutManager(requireContext(),2, RecyclerView.VERTICAL,false)
        viewModel.skin.observe(requireActivity()){
            adapter.skins=it
            adapter.notifyDataSetChanged()
        }
        viewModel.getSkinFromService()
    }
}