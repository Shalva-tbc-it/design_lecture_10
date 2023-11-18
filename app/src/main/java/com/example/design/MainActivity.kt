package com.example.design

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.design.adapter.ProfileRecyclerViewAdapter
import com.example.design.data_model.Profile
import com.example.design.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ProfileRecyclerViewAdapter
    private var profile: MutableList<Profile> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUp()
    }

    private fun setRecyclerView() {
        adapter = ProfileRecyclerViewAdapter()
        binding.rcProfile.layoutManager = LinearLayoutManager(this)
        binding.rcProfile.adapter = adapter
        adapter.setData(profile)
    }

    private fun setUp() {
        setRecyclerView()
        addProfile()

    }

    private fun addProfile() {

        val newProfile = listOf(
            Profile(
                icon = R.drawable.ic_edit_profile,
                title = getString(R.string.edit_profile),
                arrow = R.drawable.ic_arrow
            ),
            Profile(
                icon = R.drawable.ic_adress,
                title = getString(R.string.address),
                arrow = R.drawable.ic_arrow
            ),
            Profile(
                icon = R.drawable.ic_notification,
                title = getString(R.string.notification),
                arrow = R.drawable.ic_arrow
            ),
            Profile(
                icon = R.drawable.ic_payment,
                title = getString(R.string.payment),
                arrow = R.drawable.ic_arrow
            ),
            Profile(
                icon = R.drawable.ic_security,
                title = getString(R.string.security),
                arrow = R.drawable.ic_arrow
            ),
            Profile(
                icon = R.drawable.ic_language,
                title = getString(R.string.language),
                arrow = R.drawable.ic_arrow,
                language = getString(R.string.choose_language)
            ),
            Profile(
                icon = R.drawable.ic_eye_open,
                title = getString(R.string.dark_mode),
                arrow = null
            ),
            Profile(
                icon = R.drawable.ic_privacy_policy,
                title = getString(R.string.privacy_policy),
                arrow = R.drawable.ic_arrow
            ),
            Profile(
                icon = R.drawable.ic_help_center,
                title = getString(R.string.help_center),
                arrow = R.drawable.ic_arrow
            ),
            Profile(
                icon = R.drawable.ic_invite,
                title = getString(R.string.invite_friends),
                arrow = R.drawable.ic_arrow
            ),
            Profile(
                icon = R.drawable.ic_logout,
                title = getString(R.string.logout),
                arrow = R.drawable.ic_arrow,
                isRed = true
            )
        )
        profile.addAll(newProfile)

    }

}