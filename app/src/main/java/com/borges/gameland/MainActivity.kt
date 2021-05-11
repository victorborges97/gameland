package com.borges.gameland

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    val duration = Toast.LENGTH_SHORT
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {it ->
        when(it.itemId) {
            R.id.action_movie -> {
                mudarFragmentFilmes()
                return@OnNavigationItemSelectedListener true
            }
            R.id.action_games -> {
                mudarFragmentGames()
                return@OnNavigationItemSelectedListener true
            }
        }
        return@OnNavigationItemSelectedListener false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mudarFragmentGames()

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private fun mudarFragmentFilmes() {
        supportActionBar?.title = "Filmes"
        changeFragment(MovieFragment())
    }

    private fun mudarFragmentGames() {
        supportActionBar?.title = "Games"
        changeFragment(GameFragment())
    }

    private fun changeFragment(targetFragment: Fragment) {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_fragment, targetFragment, "fragment")
                .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit()
    }

}