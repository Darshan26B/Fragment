package com.darshan.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.darshan.fragment.databinding.ActivityMainBinding
import com.darshan.fragment.homefragment.HomeFragment
import com.darshan.fragment.homefragment.NextFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHome.setOnClickListener {
//            var homeFragment=HomeFragment()
//            var manager=supportFragmentManager
//            var transaction=manager.beginTransaction()
//            transaction.replace(R.id.fragFrame,homeFragment)
//            transaction.commit()
            loadFragments(HomeFragment())
        }
        binding.btnNext.setOnClickListener {
          loadFragments(NextFragment())
        }
    }

    private fun loadFragments(fragment: Fragment) {
//        var transaction=supportFragmentManager.beginTransaction()
//        transaction.replace(R.id.fragFrame,fragment)
//        transaction.commit()
        supportFragmentManager.beginTransaction().replace(R.id.fragFrame,fragment).commit()
    }
}