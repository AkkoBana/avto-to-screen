package com.akkobana.avto_to.ui.adapters.sections

import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.akkobana.avto_to.databinding.ItemSectionBinding
import com.akkobana.avto_to.model.SectionItem

class SectionViewHolder(
    private val binding: ItemSectionBinding
): RecyclerView.ViewHolder(binding.root) {
    fun bind(item: SectionItem, isLastPositions: Boolean = false) = with(binding){
        if(!item.sectionName.isNullOrEmpty()) {
            tvSectionName.text = item.sectionName
            tvSectionName.isVisible = true
        }
        else {
            tvSectionName.isVisible = false
        }
        if(item.iconId != null) {
            ivSectionIcon.setImageResource(item.iconId)
            ivSectionIcon.isVisible = true
        } else {
            ivSectionIcon.isVisible = false
        }
        if (isLastPositions) {
            (itemView.layoutParams as ViewGroup.MarginLayoutParams).marginEnd = 16
        }

    }
}
