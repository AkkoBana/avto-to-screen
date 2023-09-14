package com.akkobana.avto_to.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akkobana.avto_to.databinding.ActivityMainBinding
import com.akkobana.avto_to.ui.adapters.menu.MenuAdapter
import com.akkobana.avto_to.ui.adapters.sections.SectionAdapter
import com.akkobana.avto_to.utils.MenuItemListEntity
import com.akkobana.avto_to.utils.SectionListEntity


class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val sectionAdapter by lazy { SectionAdapter(SectionListEntity.sectionItemLists) }
    private val menuAdapter by lazy { MenuAdapter(MenuItemListEntity.menuItemList) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        initSectionsRv()
        initMenuRv()
    }

    private fun initSectionsRv() {
        binding.rvSections.adapter = sectionAdapter
    }

    private fun initMenuRv() {
        binding.rvMenu.adapter = menuAdapter
    }
}