package com.example.sproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tab_layout.addTab(tab_layout.newTab().setText("홈"))
        tab_layout.addTab(tab_layout.newTab().setText("구단"))
        tab_layout.addTab(tab_layout.newTab().setText("소식"))
        tab_layout.addTab(tab_layout.newTab().setText("개인정보"))
    }
}

class PageAdapter(
    framentManager: FragmentManager,
    val tabCount: Int
) : FragmentStatePagerAdapter(framentManager) {
//    override fun getItem(position: Int): Fragment {
//        when (position) {
//            0 -> {
//
//            }
//            1 -> {
//
//            }
//            2 -> {
//
//            }
//        }
//    }

    override fun getCount(): Int {
    }

}