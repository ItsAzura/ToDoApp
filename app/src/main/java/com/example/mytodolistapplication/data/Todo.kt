package com.example.mytodolistapplication.data

import androidx.room.Entity
import androidx.room.PrimaryKey

//Class để mô tả cấu trúc dữ liệu của 1 todoitem (dùng nó trong room)
@Entity
data class Todo(
    val title: String,
    val descrip: String?,
    val isDone: Boolean,
    @PrimaryKey
    val id: Int? = null,
)
