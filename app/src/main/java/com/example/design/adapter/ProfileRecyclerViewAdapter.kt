package com.example.design.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.design.data_model.Profile
import com.example.design.databinding.RcProfileItemBinding

class ProfileRecyclerViewAdapter: ListAdapter<Profile, ProfileRecyclerViewAdapter.ProfileRecyclerViewHolder>( object :
    DiffUtil.ItemCallback<Profile>(){
    override fun areItemsTheSame(oldItem: Profile, newItem: Profile): Boolean {
        TODO("Not yet implemented")
    }

    override fun areContentsTheSame(oldItem: Profile, newItem: Profile): Boolean {
        TODO("Not yet implemented")
    }

}

) {
    inner class ProfileRecyclerViewHolder(private val binding: RcProfileItemBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileRecyclerViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ProfileRecyclerViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}