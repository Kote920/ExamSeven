package com.example.examseven.data.local

import com.example.examseven.data.local.model.MenuItemDto
import com.example.examseven.domain.model.MenuItem

fun MenuItemDto.toDomain() = MenuItem(id = id, name = name, icon = icon, unread = unread)