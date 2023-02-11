package com.alsbihawi.abbas.mbrowser

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val myFirstFragment=OneFragment()
    private val mySecondFragment=TwoFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initSubView()
        initButton()
    }

    private fun initButton() {
        findViewById<Button>(R.id.button_change).setOnClickListener {
            showSecondFragment()
        }
    }

    private fun showSecondFragment() {
        val transaction=  supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container,mySecondFragment)
        transaction.commit()
    }


    private fun initSubView() {
      val transaction=  supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container,myFirstFragment)
        transaction.commit()
    }
}