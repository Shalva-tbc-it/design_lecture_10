package com.example.design.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.design.R
import com.example.design.data_model.Profile
import com.example.design.databinding.RcProfileItemBinding

class ProfileRecyclerViewAdapter :
    ListAdapter<Profile, ProfileRecyclerViewAdapter.ProfileRecyclerViewHolder>(object :
        DiffUtil.ItemCallback<Profile>() {
        override fun areItemsTheSame(oldItem: Profile, newItem: Profile): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Profile, newItem: Profile): Boolean {
            return oldItem == newItem
        }

    }) {


    fun setData(profile: MutableList<Profile>) {
        submitList(profile)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileRecyclerViewHolder {
        return ProfileRecyclerViewHolder(
            RcProfileItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ProfileRecyclerViewHolder, position: Int) {
        holder.bind()
    }

    inner class ProfileRecyclerViewHolder(private val binding: RcProfileItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private val customRed = ContextCompat.getColor(binding.root.context, R.color.red )
        fun bind() {
            val profile = currentList[adapterPosition]
            binding.apply {
                imgIcon.setImageResource(profile.icon)
                tvTitle.text = profile.title
                if (profile.language != null) {
                    tvLanguage.visibility = View.VISIBLE
                    tvLanguage.text = profile.language
                }
                if (profile.arrow == null) {
                    imgArrow.visibility = View.GONE
                    switchCompat.visibility = View.VISIBLE
                }
                if (profile.isRed) {
                    tvTitle.setTextColor(customRed)
                    binding.imgArrow.visibility = View.INVISIBLE
                }
            }
        }
    }
}