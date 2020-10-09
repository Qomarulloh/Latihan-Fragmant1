package com.example.android.whatsapp

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.android.whatsapp.databinding.FragmentSatuBinding

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [SatuFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [SatuFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SatuFragment : Fragment() {
    private lateinit var binding: FragmentSatuBinding
    private var data3 : Int = 3
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_satu, container, false)

        binding.nextButton.setOnClickListener{
            view: View ->
            val bundle = bundleOf("data3" to data3)
            view.findNavController().navigate(R.id.action_satuFragment_to_duaFragment, bundle)
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }

}
