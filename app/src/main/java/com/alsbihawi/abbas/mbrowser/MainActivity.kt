package com.alsbihawi.abbas.mbrowser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.alsbihawi.abbas.mbrowser.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
lateinit var binding: ActivityMainBinding
    private val myFirstFragment=OneFragment()
    private val mySecondFragment=TwoFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initSubView()
        initButtons()
    }

    private fun initButtons() {
//        findViewById<Button>(R.id.button_change).setOnClickListener {
//            showSecondFragment()
//        }
//        findViewById<Button>(R.id.button_remove).setOnClickListener {
//           removeFragment(TwoFragment.newInstance("abbas"))
//        }
//        findViewById<Button>(R.id.button_replace).setOnClickListener {
//            replaceFragment(TwoFragment.newInstance("abbas"))
//        }
    }

    private fun showSecondFragment() {
//        val  bundle=Bundle()
//        bundle.putString("name","abbas")
//        mySecondFragment.arguments=bundle
        addFragment(TwoFragment.newInstance("abbas"))
    }


    private fun initSubView() {
        addFragment(OneFragment())
        binding.bottomNavigationView.setOnItemSelectedListener{ item ->
            when(item.itemId){
                R.id.homePage-> {
                    replaceFragment(OneFragment())
                    true
                }
                R.id.messagePage-> {
                    replaceFragment(TwoFragment())
                    true
                }
                else-> false
            }

        }
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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
          when(item.itemId){
            R.id.action_cart-> {
               replaceFragment(TwoFragment())
                return  true
            }
            R.id.action_setting-> {
                replaceFragment(OneFragment())
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
       menuInflater.inflate(R.menu.menu_action_button,menu)
        return true
    }
    private fun removeFragment(fragment:Fragment) {
        val transaction=  supportFragmentManager.beginTransaction()
        transaction.remove(fragment)
        transaction.commit()
    }
}