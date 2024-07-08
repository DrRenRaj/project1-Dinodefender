package edu.msudenver.cs3013.project1_s24

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.*;
import com.google.android.material.navigation.NavigationView
//This is done as an example for simplicity and user/pwd credentials should never be stored in an app
const val USER_NAME_CORRECT_VALUE = "Anthony"
const val PASSWORD_CORRECT_VALUE = "Liberatore"

class WelcomeActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration;



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_welcome);
        setSupportActionBar(findViewById(R.id.toolbar));

        val navView: NavigationView = findViewById(R.id.nav_view)
        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_bug -> {
                    // Create an Intent to start BugActivity
                    val intent = Intent(this, BugActivity::class.java)
                    // Use the Intent to start the BugActivity
                    startActivity(intent)
                    true
                }
                // Handle other menu items...
                else -> false
            }
        }
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment;
        val navController = navHostFragment.navController;




        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_recent, R.id.nav_history, R.id.nav_geography,
                R.id.nav_bug

            ),

            findViewById(R.id.drawer_layout));

        setupActionBarWithNavController(navController, appBarConfiguration);
        findViewById<NavigationView>(R.id.nav_view)?.setupWithNavController(navController);

        // Get the username from the Intent
        val userName = intent.getStringExtra(USER_NAME_KEY)
        val password = intent.getStringExtra(PASSWORD_KEY)

        // Create a Bundle to pass the username
        val bundle = Bundle()
        bundle.putString(USER_NAME_KEY, userName)
        bundle.putString(PASSWORD_KEY, password)

        // Find the HomeFragment and set the arguments

        val homeFragment = navHostFragment.childFragmentManager.fragments[0] as HomeFragment
        homeFragment.arguments = bundle
        //Get the intent which started this activity
        intent.let { loginIntent ->

            val userNameForm = loginIntent?.getStringExtra(USER_NAME_KEY) ?: ""
            val passwordForm = loginIntent?.getStringExtra(PASSWORD_KEY) ?: ""
            val loggedInCorrectly =
                setResult(Activity.RESULT_OK, loginIntent)

        }


    }
    override fun onSupportNavigateUp(): Boolean {
        val bundle = Bundle()
        bundle.putString("USER_NAME_KEY", USER_NAME_KEY)
        val fragment = HomeFragment() // Replace with your fragment class
        fragment.arguments = bundle
        val navController = findNavController(R.id.nav_host_fragment);
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp();
    }

}