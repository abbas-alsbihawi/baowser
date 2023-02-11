package com.alsbihawi.abbas.mbrowser

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class TwoFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return  inflater.inflate(R.layout.fragment_two,container,false)

    }

    override fun onStart() {
        super.onStart()
        arguments?.let {
          val name= it.getString(KEY_NAME)
            view?.findViewById<TextView>(R.id.textViewTwo)?.text=name
        }
    }
    companion object{
        private const val KEY_NAME="name"
        fun newInstance(name:String)= TwoFragment().apply {
            arguments = Bundle().apply {
                putString(KEY_NAME, name)
            }
        }
    }
}