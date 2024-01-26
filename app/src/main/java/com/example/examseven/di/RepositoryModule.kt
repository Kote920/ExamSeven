package com.example.examseven.di

import com.example.examseven.data.repository.MenuItemsRepositoryImpl
import com.example.examseven.domain.repository.MenuItemsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideMenuItemsRepository(): MenuItemsRepository {
        return MenuItemsRepositoryImpl()
    }

}