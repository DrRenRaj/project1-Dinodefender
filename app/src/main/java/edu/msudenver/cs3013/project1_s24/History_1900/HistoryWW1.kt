package edu.msudenver.cs3013.project1_s24.History_1900

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
class HistoryWW1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        val view = inflater.inflate(R.layout.fragment_history_w_w1, container, false)
        val textView = view.findViewById<TextView>(R.id.answer_text)

        val buttonA = view.findViewById<Button>(R.id.button_A)
        buttonA.setOnClickListener {
            textView.text = "Correct! In the year 1914 the assassination of Archduke Franz Ferdinand of Austria-Hungary led to the beginning of World War I."
        }

        val buttonB = view.findViewById<Button>(R.id.button_B)
        buttonB.setOnClickListener {
            textView.text = "Incorrect! In the year 1904 the Russo-Japanese War began with a surprise attack by the Japanese on the Russian fleet at Port Arthur."
        }

        val buttonC = view.findViewById<Button>(R.id.button_C)
        buttonC.setOnClickListener {
            textView.text = "Incorrect! In the year 1917 the Russian Revolution began with the February Revolution and would eventually lead to the October Revolution. Along with the end of ww1"
        }

        val buttonD = view.findViewById<Button>(R.id.button_D)
        buttonD.setOnClickListener {
            textView.text = "Incorrect! In the Year 1939 World War II began with the German invasion of Poland."
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
            R.id.nav_history  // Replace with the actual ID of your fragment
    }

}