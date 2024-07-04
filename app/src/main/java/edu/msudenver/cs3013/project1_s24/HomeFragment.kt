package edu.msudenver.cs3013.project1_s24

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        view.findViewById<Button>(R.id.button_home)?.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.nav_home_to_content, null)
        )
// Get the username from the arguments

        val userName = arguments?.getString(USER_NAME_KEY)
        val password = arguments?.getString(PASSWORD_KEY)
        if (userName != null && password != null) {
            // Set the text of the TextView
            view.findViewById<TextView>(R.id.welcome_text)?.text = "Welcome $userName $password"
            return view
        }
        else
            return inflater.inflate(R.layout.fragment_home, container, false)

    }


}