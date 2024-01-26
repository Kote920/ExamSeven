package com.example.examseven.di

import com.example.examseven.domain.repository.MenuItemsRepository
import com.example.examseven.domain.usecase.GetMenuItemsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun provideGetMenuItemsUseCase(menuItemsRepository: MenuItemsRepository): GetMenuItemsUseCase {
        return GetMenuItemsUseCase(menuItemsRepository)
    }

}