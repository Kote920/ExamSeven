package com.example.examseven.presentation.adapters
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.examseven.databinding.ItemMenuBinding
import com.example.examseven.presentation.model.MenuItemUI


class MenuRecyclerAdapter :
    ListAdapter<MenuItemUI, MenuRecyclerAdapter.ItemsViewHolder>(ItemsDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ItemsViewHolder(
        ItemMenuBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {
        holder.bind()
    }

    inner class ItemsViewHolder(private val binding: ItemMenuBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private lateinit var model: MenuItemUI

        fun bind() {
            model = currentList[adapterPosition]
            binding.apply {
                ivIcon.setImageResource(model.icon)
                tvName.text = model.name
                if(model.unread > 0){
                    tvUnread.text = model.unread.toString()
                }
            }
        }
    }

    class ItemsDiffUtil : DiffUtil.ItemCallback<MenuItemUI>() {
        override fun areItemsTheSame(oldItem: MenuItemUI, newItem: MenuItemUI): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: MenuItemUI, newItem: MenuItemUI): Boolean {
            return oldItem == newItem
        }
    }
}
