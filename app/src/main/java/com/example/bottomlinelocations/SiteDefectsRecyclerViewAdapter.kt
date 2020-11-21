package com.example.bottomlinelocations

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.lang.IllegalStateException

class SiteDefectsRecyclerViewAdapter(
    private val activity: MainActivity,
    private val siteDefects: List<SiteDefects>
) : RecyclerView.Adapter<SiteDefectsRecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val siteNameText: TextView = view.findViewById(R.id.siteNameText)
        var id: Int? = null

        init {
            view.setOnClickListener{
                val id = id ?: throw IllegalStateException()
                activity.showDetail(id)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(activity)
            .inflate(R.layout.view_site_defects_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.i("SiteDefectsRecyclerView", "onBindViewHolder: $position")
        val siteDefect = siteDefects[position]

        holder.id = siteDefect.id
        holder.siteNameText.text = siteDefect.siteName
    }
    override fun getItemCount(): Int = siteDefects.size
}