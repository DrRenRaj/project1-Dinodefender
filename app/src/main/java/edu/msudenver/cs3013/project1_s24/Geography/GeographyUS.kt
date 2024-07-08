package edu.msudenver.cs3013.project1_s24.Geography

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import edu.msudenver.cs3013.project1_s24.R
import edu.msudenver.cs3013.project1_s24.SharedViewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [History_civil_war.newInstance] factory method to
 * create an instance of this fragment.
 */
class GeographyUS : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        val view = inflater.inflate(R.layout.fragment_geography_u_s, container, false)
        val textView = view.findViewById<TextView>(R.id.answer_text)

        val buttonA = view.findViewById<Button>(R.id.button_A)
        buttonA.setOnClickListener {
            textView.text = "correct! The capital of Kansas is Topeka."
        }

        val buttonB = view.findViewById<Button>(R.id.button_B)
        buttonB.setOnClickListener {
            textView.text = "Incorrect! The capital of Kansas is Topeka. A fun fact too is that half of Kansas city Kansas is not in Kansas but in Missouri."
        }

        val buttonC = view.findViewById<Button>(R.id.button_C)
        buttonC.setOnClickListener {
            textView.text = "Incorrect!"
        }

        val buttonD = view.findViewById<Button>(R.id.button_D)
        buttonD.setOnClickListener {
            textView.text = "Incorrect!"
        }

        return view

    }

    override fun onResume() {
        super.onResume()

        // Get the shared ViewModel
        val sharedViewModel =
            ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        // Update the lastFragmentId
        sharedViewModel.lastFragmentId =
            R.id.nav_history_civil_war  // Replace with the actual ID of your fragment
    }

}