package com.example.billbuddy

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.billbuddy.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Toast.makeText(getContext(), "OnAttach Called", Toast.LENGTH_SHORT).show()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.friendsBtn.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_friendsFragment)
        }

        binding.newGroupBtn.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_newGroupFragment)
        }

        binding.addExpensesBtn.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_addExpenseFragment)
        }

        binding.accountBtn.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_accountFragment)
        }

        binding.transactionBtn.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_transactionFragment)
        }

        return binding.root
    }

}