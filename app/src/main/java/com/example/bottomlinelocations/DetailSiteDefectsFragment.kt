package com.example.bottomlinelocations

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.bottomlinelocations.databinding.FragmentDetailSiteDefectsBinding

// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_SITE_DEFECTS_ID = "param1"

/**
 * A simple [Fragment] subclass.
 * Use the [ListSiteDefectsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailSiteDefectsFragment : Fragment() {
    private var siteDefectsId: Int? = null
    private lateinit var binding: FragmentDetailSiteDefectsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            siteDefectsId = it.getInt(ARG_SITE_DEFECTS_ID)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_detail_site_defects, container, false)

        val id: Int = siteDefectsId ?: throw IllegalArgumentException()
        binding.siteDefects = SiteDefects.getById(id)

        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @return A new instance of fragment ListSiteDefectsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(siteDefectsId: Int) =
            DetailSiteDefectsFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SITE_DEFECTS_ID, siteDefectsId)
                }
            }
    }
}