package edu.msudenver.cs3013.project1_s24.History_1800

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
class History_civil_war : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        val view = inflater.inflate(R.layout.fragment_history_civil_war, container, false)
        val textView = view.findViewById<TextView>(R.id.answer_text)

        val buttonA = view.findViewById<Button>(R.id.button_A)
        buttonA.setOnClickListener {
            textView.text = "Incorrect! In the year 1821 Greece begin and would eventually succeed in their war for independence from the Ottoman Empire."
        }

        val buttonB = view.findViewById<Button>(R.id.button_B)
        buttonB.setOnClickListener {
            textView.text = "Incorrect! In the year 1812 the United States declared war on the United Kingdom, beginning the War of 1812. As well as Napoleon's defeat in Russia in 1812."
        }

        val buttonC = view.findViewById<Button>(R.id.button_C)
        buttonC.setOnClickListener {
            textView.text = "Incorrect! In the year 1865 the American Civil War ended with the surrender of the Confederate States of America."
        }

        val buttonD = view.findViewById<Button>(R.id.button_D)
        buttonD.setOnClickListener {
            textView.text = "Correct! in the year 1861 the American Civil War began with the Confederate States of America attacking Fort Sumter."
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