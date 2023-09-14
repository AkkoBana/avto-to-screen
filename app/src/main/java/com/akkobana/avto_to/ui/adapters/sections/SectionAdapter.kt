package com.akkobana.avto_to.ui.adapters.sections

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akkobana.avto_to.databinding.ItemSectionBinding
import com.akkobana.avto_to.model.SectionItem

class SectionAdapter(
    private val list: List<SectionItem>
) : RecyclerView.Adapter<SectionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SectionViewHolder =
        SectionViewHolder( ItemSectionBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: SectionViewHolder, position: Int) {
        if (position == list.size - 1) {
            holder.bind(list[position], true)
        } else {
            holder.bind(list[position])
        }
    }

    override fun getItemCount(): Int = list.size
}