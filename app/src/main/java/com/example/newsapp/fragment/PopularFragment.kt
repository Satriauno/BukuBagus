package com.example.newsapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.data.DataNews
import com.example.newsapp.adapter.NewsAdapter
import com.example.newsapp.R
import com.example.newsapp.initNewsHeadline

class PopularFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_popular, container, false)

        val rvAllNews = view.findViewById<RecyclerView>(R.id.rv_popular_news)
        rvAllNews.layoutManager = LinearLayoutManager(view.context)
        rvAllNews.adapter = NewsAdapter(DataNews.dataPopular)

        val newsHeadline = view.findViewById<View>(R.id.news_headline)
        initNewsHeadline( newsHeadline ,1, view.context)

        return view
    }


}