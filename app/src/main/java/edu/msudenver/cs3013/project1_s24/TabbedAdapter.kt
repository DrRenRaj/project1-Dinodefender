package edu.msudenver.cs3013.project1_s24

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import edu.msudenver.cs3013.project1_s24.R
import edu.msudenver.cs3013.project1_s24.TheBugsFragments

val TAB_GENRES_SCROLLABLE = listOf(
    R.string.bugA,
    R.string.bugB,
    R.string.bugC,
)
val TAB_GENRES_FIXED = listOf(R.string.bugA, R.string.bugB, R.string.bugC)

class TabbedAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return TAB_GENRES_SCROLLABLE.size
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> BugAFragment()
            1 -> BugBFragment()
            2 -> BugCFragment()
            else -> throw IllegalStateException("Invalid position: $position")
        }
    }
}