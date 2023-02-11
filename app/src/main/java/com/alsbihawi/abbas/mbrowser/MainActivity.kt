package com.alsbihawi.abbas.mbrowser

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    private val myFirstFragment=OneFragment()
    private val mySecondFragment=TwoFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initSubView()
        initButtons()
    }

    private fun initButtons() {
        findViewById<Button>(R.id.button_change).setOnClickListener {
            showSecondFragment()
        }
        findViewById<Button>(R.id.button_remove).setOnClickListener {
           removeFragment(TwoFragment.newInstance("abbas"))
        }
        findViewById<Button>(R.id.button_replace).setOnClickListener {
            replaceFragment(TwoFragment.newInstance("abbas"))
        }
    }

    private fun showSecondFragment() {
//        val  bundle=Bundle()
//        bundle.putString("name","abbas")
//        mySecondFragment.arguments=bundle
        addFragment(TwoFragment.newInstance("abbas"))
    }


    private fun initSubView() {
        addFragment(myFirstFragment)
    }

    private fun addFragment(fragment:Fragment) {
        val transaction=  supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container,fragment)
        transaction.commit()
    }
    private fun replaceFragment(fragment:Fragment) {
        val transaction=  supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container,fragment)
        transaction.commit()
    }
    private fun removeFragment(fragment:Fragment) {
        val transaction=  supportFragmentManager.beginTransaction()
        transaction.remove(fragment)
        transaction.commit()
    }
}