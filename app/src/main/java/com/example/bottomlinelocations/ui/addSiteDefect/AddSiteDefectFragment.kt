package com.example.bottomlinelocations.ui.addSiteDefect

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.bottomlinelocations.R
import com.example.bottomlinelocations.databinding.FragmentAddSiteDefectsBinding

class AddSiteDefectFragment : Fragment() {

    private lateinit var addSiteDefectViewModel: AddSiteDefectViewModel
    private lateinit var binding: FragmentAddSiteDefectsBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        addSiteDefectViewModel =
                ViewModelProvider(this).get(AddSiteDefectViewModel::class.java)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_site_defects, container, false)
        /*val textView: TextView = root.findViewById(R.id.text_gallery)
        addSiteDefectViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

         */
        return binding.root
    }
}