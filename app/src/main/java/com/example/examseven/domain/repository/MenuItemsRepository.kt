package com.example.examseven.domain.repository

import com.example.examseven.domain.model.MenuItem
import com.example.midtermproject.data.common.Resource
import kotlinx.coroutines.flow.Flow

interface  MenuItemsRepository {
    suspend fun getMenuItems(): Flow<List<MenuItem>>

}