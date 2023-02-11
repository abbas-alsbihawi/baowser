package com.alsbihawi.abbas.mbrowser

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.alsbihawi.abbas.mbrowser.databinding.FragmentOneBinding

class OneFragment:Fragment() {

    lateinit var binding: FragmentOneBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentOneBinding.inflate(inflater,container,false)
        Log.v(LOG_TAG,"onCreateView")
        return  binding.root

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v(LOG_TAG,"onCreate")
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.v(LOG_TAG,"onAttach")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.v(LOG_TAG,"onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.v(LOG_TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.v(LOG_TAG,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.v(LOG_TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.v(LOG_TAG,"onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.v(LOG_TAG,"onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(LOG_TAG,"onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.v(LOG_TAG,"onDetach")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.v(LOG_TAG,"onViewCreated")
        addCallBacks()
    }

    private fun addCallBacks() {
        binding.floatingActionButton.setOnClickListener {
            Toast.makeText(context,"hi FAB",Toast.LENGTH_SHORT).show()
        }
    }

    companion object{
        val LOG_TAG="FFF_ONE" //TwoFragment::class.java.simpleName
    }

}