package com.example.bottomlinelocations.ui.listSiteDefects

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bottomlinelocations.MainActivity
import com.example.bottomlinelocations.R
import com.example.bottomlinelocations.data.SiteDefects
import com.example.bottomlinelocations.databinding.FragmentListSiteDefectsBinding

class ListSiteDefectsFragment : Fragment() {
    private lateinit var binding: FragmentListSiteDefectsBinding
    private lateinit var listSiteDefectsViewModel: SlideshowViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        listSiteDefectsViewModel =
                ViewModelProvider(this).get(SlideshowViewModel::class.java)
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_list_site_defects, container, false)
        /*val textView: TextView = root.findViewById(R.id.text_slideshow)
        listSiteDefectsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

         */
        /*
        val listSiteDefects = newInstance()
      supportFragmentManager.beginTransaction()
            .replace(R.id.activeFragment, listSiteDefects)
            .commit()

         */

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("ListDefectsFragment", "OnCreateView: ${SiteDefects.getAll()}")
        val adapter = SiteDefectsRecyclerViewAdapter(activity as MainActivity, SiteDefects.getAll())
        binding.siteDefectRecycler.setHasFixedSize(true)
        binding.siteDefectRecycler.layoutManager = LinearLayoutManager(activity)
        binding.siteDefectRecycler.adapter = adapter

        view.findViewById<Button>(R.id.addNewSiteDefectButton).setOnClickListener{
            findNavController().navigate(R.id.action_nav_listSiteDefects_to_nav_addSiteDefect)
        }

    }

        companion object {
        fun newInstance() =
            ListSiteDefectsFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}