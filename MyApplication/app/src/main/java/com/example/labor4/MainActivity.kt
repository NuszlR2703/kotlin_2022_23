package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.EndQuizFragmentBinding
import com.example.myapplication.fragment.QuestionFragment
import com.example.myapplication.fragment.QuizEndFragment
import com.example.myapplication.fragment.QuizStartFragment

import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : FragmentActivity() {

//    private val questionFragment = QuestionFragment()
//    private val quizStartFragment = QuizStartFragment()
//    private val quizEndFragment = QuizEndFragment()
//
//    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView( R.layout.activity_main)
        handleNavigation()
    }

    private fun replaceFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.nav_host_fragment, fragment)
        transaction.commit()
    }

    override fun onStart() {
        super.onStart()

        Log.d("tag1","onStart() called")
        //handleNavigation()
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        binding.bottomNavigation.setOnItemSelectedListener {
//            when(it.itemId){
//                R.id.page_1 -> replaceFragment(quizStartFragment)
//                R.id.page_2 -> replaceFragment(questionFragment)
//                R.id.page_3 -> replaceFragment(quizEndFragment)
//                else ->{}
//            }
//            true
//        }
    }

    private fun handleNavigation()
    {
        Log.d("navigation","Started handle")

        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.page_1 -> {
                    //val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
                    //val navController = navHostFragment.navController
                    Log.d("navigation", "First")
                    //navController.navigate(R.id.quizStartFragment)

                    true
                }
                R.id.page_2 -> {
                    val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
                    val navController = navHostFragment.navController
                    Log.d("navigation", "Second")
                    navController.navigate(R.id.questionFragment)
                    true
                }
                R.id.page_3 -> {
                    val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
                    val navController = navHostFragment.navController
                    Log.d("navigation", "Third")
                    navController.navigate(R.id.quizEndFragment)
                    true
                }
                else -> false
            }
        }
    }
}