package com.example.examseven.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examseven.R
import com.example.examseven.data.local.model.MenuItemDto
import com.example.examseven.databinding.ActivityMainBinding
import com.example.examseven.presentation.adapters.MenuRecyclerAdapter
import com.example.examseven.presentation.base.DrawerViewDragHelper
import com.example.examseven.presentation.model.MenuItemUI
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var menuRecyclerAdapter: MenuRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        menuRecyclerAdapter = MenuRecyclerAdapter()
        // Sample menu items
        val menuItems =
            listOf(
                MenuItemUI(1, name = "Dashboard", icon = R.drawable.ic_dashboard, unread = 0),
                MenuItemUI(2, name = "Post", icon = R.drawable.ic_post, unread = 15 ),
                MenuItemUI(3, name = "Notifications", icon = R.drawable.ic_notification, unread = 20 ),
                MenuItemUI(4, name = "Calendar", icon = R.drawable.ic_calendar, unread = 0 ),
                MenuItemUI(5, name = "Statistics", icon = R.drawable.ic_statistics, unread = 0),
                MenuItemUI(6, name = "Settings", icon = R.drawable.ic_settings, unread = 0 )
        )

        // Set up RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = menuRecyclerAdapter
        menuRecyclerAdapter.submitList(menuItems)


        // Set the gravity to start to make the drawer appear from the left
//         drawerLayout.gravity = Gravity.START

//        // Set peek area for the drawer using ViewDragHelper
//        val drawerDragHelper = DrawerViewDragHelper(binding.drawerLayout)
//        drawerDragHelper.setEdgeSize(resources.getDimensionPixelSize(R.dimen.drawer_peek_width))
    }
}
