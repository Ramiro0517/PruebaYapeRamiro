package com.example.pruebayape.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.pruebayape.databinding.FragmentDetailBinding
import com.squareup.picasso.Picasso
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class DetailFragment : Fragment() {


    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!
    private val detailFragmentViewModel by viewModels<DetailViewModel>()

    private val args: DetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        detailFragmentViewModel.receta.observe(viewLifecycleOwner) { receta ->
            binding.nombre.text = receta.nombre
            binding.descripcion.text = receta.ingredientes.joinToString("\n")
            binding.instrucciones.text = receta.instrucciones.joinToString("\n")
            Picasso.get().load(receta.imagen).into(binding.image)
        }

        detailFragmentViewModel.setReceta(args.receta!!)

        binding.btnMapa.setOnClickListener {
            val origen = args.receta!!
            val action = DetailFragmentDirections.actionDetailFragmentToMapFragment(origen)
            findNavController().navigate(action)
        }
    }

}