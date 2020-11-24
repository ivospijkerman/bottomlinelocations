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
        val timestampText: TextView = view.findViewById(R.id.timestampText)
        var id: Int? = null

        init {
            view.setOnClickListener{
                Log.i("", ": tot hier $id")
                val id = id ?: throw IllegalStateException()
                //it.findNavController().navigate()
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

        // makes title of subject in list
        holder.id = siteDefect.id
        holder.siteNameText.text = siteDefect.siteName
        holder.timestampText.text = siteDefect.timestamp
    }
    override fun getItemCount(): Int = siteDefects.size
}