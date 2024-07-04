package edu.msudenver.cs3013.project1_s24

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController

import androidx.lifecycle.ViewModel
// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class SharedViewModel : ViewModel() {
    var lastFragmentId: Int? = null
}
class RecentFragment : Fragment() {
    override fun onResume() {
        super.onResume()

        // Get the shared ViewModel
        val sharedViewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        // Get the NavController
        val navController = findNavController()

        // Get the current destination
        val currentDestination = navController.currentDestination?.id

        // Navigate to the last fragment if it's not the current destination
        if (sharedViewModel.lastFragmentId != currentDestination) {
            sharedViewModel.lastFragmentId?.let { navController.navigate(it) }
        }
    }

}