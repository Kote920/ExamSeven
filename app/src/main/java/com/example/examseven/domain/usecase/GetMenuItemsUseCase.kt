package com.example.examseven.domain.usecase

import com.example.examseven.domain.model.MenuItem
import com.example.examseven.domain.repository.MenuItemsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.collect

class GetMenuItemsUseCase(private val repository: MenuItemsRepository): Flow<List<MenuItem>> {
    override suspend fun collect(collector: FlowCollector<List<MenuItem>>) {

        return repository.getMenuItems().collect{

        }

    }
}