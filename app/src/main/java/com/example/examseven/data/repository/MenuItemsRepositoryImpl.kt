package com.example.examseven.data.repository

import android.util.Log
import com.example.examseven.R
import com.example.examseven.data.local.model.MenuItemDto
import com.example.examseven.data.local.toDomain
import com.example.examseven.domain.model.MenuItem
import com.example.examseven.domain.repository.MenuItemsRepository
import com.example.midtermproject.data.common.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MenuItemsRepositoryImpl: MenuItemsRepository {
    override suspend fun getMenuItems(): Flow<List<MenuItem>> {

        return flow {

            emit(listOf(
                MenuItemDto(1, name = "Dashboard", icon = R.drawable.ic_dashboard, unread = 0, ),
                MenuItemDto(2, name = "Post", icon = R.drawable.ic_post, unread = 15, ),
                MenuItemDto(3, name = "Notifications", icon = R.drawable.ic_notification, unread = 20, ),
                MenuItemDto(4, name = "Calendar", icon = R.drawable.ic_calendar, unread = 0, ),
                MenuItemDto(5, name = "Statistics", icon = R.drawable.ic_statistics, unread = 0, ),
                MenuItemDto(6, name = "Settings", icon = R.drawable.ic_settings, unread = 0, )
            ).map { it.toDomain() })
        }


    }
}
