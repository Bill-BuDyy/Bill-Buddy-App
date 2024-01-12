package com.example.billbuddy.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.billbuddy.databinding.FragmentHomeBinding
import com.example.billbuddy.databinding.FragmentNewGroupBinding

class NewGroupFragment : Fragment() {

    private var _binding: FragmentNewGroupBinding? = null
    private val binding get() = _binding!!

    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNewGroupBinding.inflate(inflater, container, false)

        return binding.root
    }

}