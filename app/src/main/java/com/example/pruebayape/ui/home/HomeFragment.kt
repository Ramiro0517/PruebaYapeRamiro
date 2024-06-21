package com.example.pruebayape.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pruebayape.databinding.FragmentHomeBinding
import com.example.pruebayape.ui.home.adapter.HomeAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private val homeFragmentViewModel by viewModels<HomeViewModel>()
    private lateinit var homeAdapter: HomeAdapter

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI(){
        initRecycler()
        initUIState()
    }

    private fun initRecycler() {
        homeAdapter = HomeAdapter()
        binding.apply {
            recyclerView.layoutManager = LinearLayoutManager(requireContext())
            recyclerView.adapter = homeAdapter
        }
    }

    private fun initUIState() {

        lifecycleScope.launch {
            homeFragmentViewModel.recetas.observe(viewLifecycleOwner) {
               homeAdapter.updateData(it)
            }
        }

    }

}