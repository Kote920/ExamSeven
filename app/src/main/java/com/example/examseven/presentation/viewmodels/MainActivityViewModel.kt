package com.example.examseven.presentation.viewmodels

import androidx.lifecycle.ViewModel
import com.example.examseven.domain.repository.MenuItemsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel

class MainActivityViewModel @Inject constructor(repository: MenuItemsRepository): ViewModel() {

    fun getItems(){

    }

}