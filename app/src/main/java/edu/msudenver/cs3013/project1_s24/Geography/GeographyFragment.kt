package edu.msudenver.cs3013.project1_s24.Geography

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import edu.msudenver.cs3013.project1_s24.R
import edu.msudenver.cs3013.project1_s24.SharedViewModel

/**
 * A simple [Fragment] subclass.
 * Use the [GeographyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GeographyFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        val view = inflater.inflate(R.layout.fragment_geography, container, false)
        view.findViewById<Button>(R.id.button_US)?.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.nav_geography_to_us, null)

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
            R.id.nav_content  // Replace with the actual ID of your fragment
    }
}