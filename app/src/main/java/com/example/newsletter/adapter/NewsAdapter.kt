package com.example.newsletter.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsletter.R
import com.example.newsletter.entity.News
import com.example.newsletter.viewholder.NewsViewHolder

class NewsAdapter(news: ArrayList<News>, context: Context) : RecyclerView.Adapter<NewsViewHolder>() {

    val mContext = context
    val mNews = news

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_news, parent, false))
    }

    override fun getItemCount(): Int = mNews.size

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.title.setText(mNews.get(position).title)
        holder.body.setText(mNews.get(position).body)
        holder.date.setText(mNews.get(position).date)
    }
}