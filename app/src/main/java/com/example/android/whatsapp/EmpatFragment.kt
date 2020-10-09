package com.example.android.whatsapp

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.android.whatsapp.databinding.FragmentEmpatBinding

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [EmpatFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [EmpatFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EmpatFragment : Fragment() {
    private lateinit var binding: FragmentEmpatBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_empat, container, false)
        binding.backButton.setOnClickListener { view: View -> view.findNavController().navigate(R.id.action_empatFragment_to_duaFragment)  }
        return binding.root
    }
}
