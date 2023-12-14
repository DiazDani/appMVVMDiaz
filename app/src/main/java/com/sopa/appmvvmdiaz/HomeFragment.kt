package com.sopa.appmvvmdiaz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.sopa.appmvvmdiaz.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private val viewModel: HomeViewModel by viewModels()
    private val sharedViewModel: SharedViewModel by viewModels()
    private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(inflater)

        binding.button2.setOnClickListener {
            val check = viewModel.login(
                binding.editTextUser.text.toString(),
                binding.editTextTextPassword.text.toString()
            )


            if (check) {
               sharedViewModel.sendMessage(binding.editTextUser.text.toString())

                findNavController().navigate(R.id.action_homeFragment_to_listFragment, null)
                Toast.makeText(activity, "Welcome", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(activity,"codigo incorrecto", Toast.LENGTH_SHORT).show()
            }
        }


        return binding.root
    }


}