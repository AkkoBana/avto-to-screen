package com.akkobana.avto_to.ui.adapters.menu

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akkobana.avto_to.model.Menu
import com.akkobana.avto_to.databinding.ItemMenuBinding

class MenuAdapter(
    private val menuItemList: List<Menu>
) : RecyclerView.Adapter<MenuViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder =
        MenuViewHolder(ItemMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false))


    override fun getItemCount(): Int = menuItemList.size

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bind(menuItemList[position])
    }
}