package com.sopa.appmvvmdiaz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.sopa.appmvvmdiaz.databinding.FragmentListBinding


class ListFragment : Fragment() {
    private val viewModel: ListViewModel by viewModels()
    private val sharedViewModel:SharedViewModel by viewModels()
    private lateinit var binding: FragmentListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentListBinding.inflate(inflater)

        val recentUser= sharedViewModel.message.toString()

        viewModel.findUser(recentUser)

        binding.textView.text= viewModel.nom
        binding.textView2.text=viewModel.edat.toString()
        binding.textView3.text=viewModel.mail

        binding.viewContainer.setOnClickListener{
            viewModel.randomUser()
            binding.textView.text= viewModel.nom
            binding.textView2.text=viewModel.edat.toString()
            binding.textView3.text=viewModel.mail
        }

        return binding.root
    }

}