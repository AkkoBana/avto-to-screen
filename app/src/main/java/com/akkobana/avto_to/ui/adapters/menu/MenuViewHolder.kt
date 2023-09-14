package com.akkobana.avto_to.ui.adapters.menu

import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.akkobana.avto_to.model.Menu
import com.akkobana.avto_to.databinding.ItemMenuBinding

class MenuViewHolder(
    private val binding: ItemMenuBinding
): RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Menu) = with(binding){
        if(item.iconId != null){
            ivMenuIcon.setImageResource(item.iconId)
            ivMenuIcon.isVisible = true
        } else
            ivMenuIcon.isVisible = false
        if(!item.menuText.isNullOrEmpty()) {
            tvMenuText.text = item.menuText
            tvMenuText.isVisible = true
        } else
            tvMenuText.isVisible = false
    }
}