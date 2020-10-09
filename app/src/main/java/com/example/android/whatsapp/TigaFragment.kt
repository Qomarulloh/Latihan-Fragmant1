package com.example.android.whatsapp

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.android.whatsapp.databinding.FragmentTigaBinding

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [TigaFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [TigaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TigaFragment : Fragment() {
    private lateinit var binding: FragmentTigaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        Log.i("SatuFrgament", "onCreateView called")
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_tiga, container, false)
        binding.backButton.setOnClickListener { view: View -> view.findNavController().navigate(R.id.action_tigaFragment_to_duaFragment)}

        Toast.makeText(context, "Data 1: ${arguments?.getInt("data1")}, Data 2: ${arguments?.getInt("data2")}, Data 3: ${arguments?.getInt("data3")}",Toast.LENGTH_LONG).show()

        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.share_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.share -> {
                val intent = Intent(Intent.ACTION_SEND)
                intent.setType("text/plain")
                intent.putExtra(Intent.EXTRA_TEXT, "Data 1: ${arguments?.getInt("data1")}")
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
            Log.i("SatuFrgament", "onAttach called")
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("SatuFrgament", "onCreate called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("SatuFrgament", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("SatuFrgament", "onPause called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("SatuFrgament", "onDestroyView called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("SatuFrgament", "onStop called")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("SatuFrgament", "onDestroy called")
    }
    override fun onDetach() {
        super.onDetach()
        Log.i("SatuFrgament", "onDetach called")
    }
}
