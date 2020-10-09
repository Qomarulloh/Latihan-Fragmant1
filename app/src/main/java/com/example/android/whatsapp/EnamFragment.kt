package com.example.android.whatsapp

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.android.whatsapp.databinding.FragmentEnamBinding

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [EnamFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [EnamFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EnamFragment : Fragment() {
    private lateinit var binding: FragmentEnamBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_enam, container, false)
        return binding.root
    }
}
