package com.example.bottomlinelocations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.ListFragment
import com.example.bottomlinelocations.DetailSiteDefectsFragment.Companion.newInstance
import com.example.bottomlinelocations.databinding.ActivityMainBinding
import java.lang.reflect.Array.newInstance
import javax.xml.datatype.DatatypeFactory.newInstance

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val listSiteDefects = ListSiteDefectsFragment.newInstance()
        supportFragmentManager.beginTransaction()
            .add(R.id.activeFragment, listSiteDefects)
            .commit()
    }

    fun showDetail(siteDefectsId: Int) {
        val detailSiteDefectsFragment = DetailSiteDefectsFragment.newInstance(siteDefectsId)
        supportFragmentManager.beginTransaction()
            .replace(R.id.activeFragment, detailSiteDefectsFragment)
            .addToBackStack(null)
            .commit()
    }
}