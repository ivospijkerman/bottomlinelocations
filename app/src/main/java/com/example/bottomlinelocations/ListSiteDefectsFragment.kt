package com.example.bottomlinelocations

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bottomlinelocations.databinding.FragmentListSiteDefectsBinding

/**
 * A simple [Fragment] subclass.
 * Use the [ListSiteDefectsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListSiteDefectsFragment : Fragment() {
    private lateinit var binding: FragmentListSiteDefectsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_list_site_defects, container, false)

        Log.i("ListDefectsFragment", "OnCreateView: ${SiteDefects.getAll()}")
        val adapter = SiteDefectsRecyclerViewAdapter(activity as MainActivity, SiteDefects.getAll())
        binding.siteDefectRecycler.setHasFixedSize(true)
        binding.siteDefectRecycler.layoutManager = LinearLayoutManager(activity)
        binding.siteDefectRecycler.adapter = adapter

        binding.addNewSiteDefectButton.setOnClickListener { v: View ->
            v.findNavController().navigate(ListSiteDefectsFragmentDirections.actionListSiteDefectsFragmentToAddSiteDefects())
        }

        return binding.root
    }

    companion object {
        fun newInstance() =
            ListSiteDefectsFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}
