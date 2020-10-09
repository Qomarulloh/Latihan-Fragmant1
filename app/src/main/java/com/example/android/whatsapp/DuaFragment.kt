package com.example.android.whatsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.android.whatsapp.databinding.FragmentDuaBinding

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [DuaFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [DuaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DuaFragment : Fragment() {
    private lateinit var binding: FragmentDuaBinding
    private var data1: Int = 1
    private var data2: Int = 2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_dua, container, false)

        binding.nextButton.setOnClickListener { view: View ->
            if (binding.pindahCheckBox.isChecked)
                view.findNavController().navigate(R.id.action_duaFragment_to_empatFragment3)
            else{
                val bundle = bundleOf("data1" to data1, "data2" to data2, "data3" to arguments?.getInt("data3"))
                view.findNavController().navigate(R.id.action_duaFragment_to_tigaFragment, bundle)
            }
        }
        return binding.root
    }
}
