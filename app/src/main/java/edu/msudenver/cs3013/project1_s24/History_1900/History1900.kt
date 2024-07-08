package edu.msudenver.cs3013.project1_s24.History_1900

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import edu.msudenver.cs3013.project1_s24.R
import edu.msudenver.cs3013.project1_s24.SharedViewModel

/**
 * A simple [Fragment] subclass.
 * Use the [History1800.newInstance] factory method to
 * create an instance of this fragment.
 */
class History1900 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        val view = inflater.inflate(R.layout.fragment_history_1900, container, false)
        view.findViewById<Button>(R.id.WW1_button)?.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.nav_history1900_to_WWI, null)

        )
        return view
    }

    override fun onResume() {
        super.onResume()

        // Get the shared ViewModel
        val sharedViewModel =
            ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        // Update the lastFragmentId
        sharedViewModel.lastFragmentId =
            R.id.nav_history1900  // Replace with the actual ID of your fragment
    }

}