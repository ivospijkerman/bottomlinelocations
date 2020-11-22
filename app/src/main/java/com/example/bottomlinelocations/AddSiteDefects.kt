package com.example.bottomlinelocations

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.bottomlinelocations.databinding.FragmentAddSiteDefectsBinding

/**
 * A simple [Fragment] subclass.
 * Use the [AddSiteDefects.newInstance] factory method to
 * create an instance of this fragment.
 */
class AddSiteDefects : Fragment() {
    private lateinit var binding: FragmentAddSiteDefectsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_add_site_defects, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }
/*
    companion object {
        fun newInstance() =
            AddSiteDefects().apply {
                arguments = Bundle().apply {
                }
            }
    }
 */
}