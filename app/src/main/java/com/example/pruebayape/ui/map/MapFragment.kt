package com.example.pruebayape.ui.map

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.pruebayape.R
import com.example.pruebayape.databinding.FragmentMapBinding
import com.example.pruebayape.domain.model.RecetaResponse
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MapFragment : Fragment(), OnMapReadyCallback {

    private var _binding: FragmentMapBinding? = null
    private val binding get() = _binding!!

    private var gmap: GoogleMap? = null

    // Recibe el objeto RecetaResponse
    private val args: MapFragmentArgs by navArgs()
    private lateinit var receta: RecetaResponse

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMapBinding.inflate(layoutInflater, container, false)

        receta = args.receta

        val mapFragment = childFragmentManager.findFragmentById(R.id.map1) as SupportMapFragment
        mapFragment.getMapAsync (this)

        return binding.root
    }

    override fun onMapReady(p0: GoogleMap) {
        gmap = p0
        val location = LatLng(receta.coordenadas.latitud, receta.coordenadas.longitud)
        gmap?.addMarker(MarkerOptions().position(location).title("Mi ubicación"))
        gmap?.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 16f))
    }


}