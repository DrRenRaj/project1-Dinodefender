package edu.msudenver.cs3013.project1_s24

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [History1800.newInstance] factory method to
 * create an instance of this fragment.
 */
class History1800 : Fragment() {
        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?

        ): View? {
            return inflater.inflate(R.layout.fragment_history_1800, container, false)
        }
        override fun onResume() {
            super.onResume()

            // Get the shared ViewModel
            val sharedViewModel =
                ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

            // Update the lastFragmentId
            sharedViewModel.lastFragmentId =
                R.id.nav_content  // Replace with the actual ID of your fragment
        }
    }
