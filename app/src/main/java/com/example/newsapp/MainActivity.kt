package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.newsapp.adapter.SectionPagerAdaptor
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        val vpNews = findViewById<ViewPager2>(R.id.vp_news)
        vpNews.adapter = SectionPagerAdaptor(this)

        val list = arrayOf("All News", "Top", "Popular")
        val tabs =findViewById<TabLayout>(R.id.tabs)
        TabLayoutMediator(tabs, vpNews) { tab, position ->
            tab.text = list[position]
        }.attach()
    }
}