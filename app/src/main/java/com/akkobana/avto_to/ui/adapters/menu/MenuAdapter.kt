package com.akkobana.avto_to.ui.adapters.menu

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akkobana.avto_to.databinding.ItemMenuBinding
import com.akkobana.avto_to.model.Menu

class MenuAdapter(
    private val menuItemList: List<Menu>
) : RecyclerView.Adapter<MenuViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder =
        MenuViewHolder(ItemMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false))


    override fun getItemCount(): Int = menuItemList.size

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        if (position == menuItemList.size - 1) {
            holder.bind(menuItemList[position], true)
        } else {
            holder.bind(menuItemList[position])
        }
    }
}