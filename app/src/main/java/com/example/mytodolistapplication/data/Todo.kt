package com.example.mytodolistapplication.data

import androidx.room.Entity
import androidx.room.PrimaryKey

//Class để đingj nghĩa cấu trúc dữ liệu của 1 todoitem (dùng nó trong room)
//Todo là model class đại diện cho data todo item.
@Entity
data class Todo(
    val title: String,
    val descrip: String?,
    val isDone: Boolean,
    @PrimaryKey
    val id: Int? = null,
)
