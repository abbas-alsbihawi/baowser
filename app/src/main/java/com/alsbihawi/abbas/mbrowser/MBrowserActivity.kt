package com.alsbihawi.abbas.mbrowser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.alsbihawi.abbas.mbrowser.databinding.ActivityMbrwoserBinding

class MBrowserActivity : AppCompatActivity() {
    lateinit var binding: ActivityMbrwoserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMbrwoserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val url=intent.data.toString()
        binding.webView.loadUrl(url)
        Log.i(LOG_TAG,url)
    }
    companion object{
        const val LOG_TAG="M_BROWSER_ACTIVITY"
    }
}