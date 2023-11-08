package com.example.mytodolistapplication.data

import kotlinx.coroutines.flow.Flow

//là interface định nghĩa các phương thức để truy xuất dữ liệu todo từ nhiều nguồn khác nhau.
interface TodoRepository {
    //cung cấp interface để truy xuất dữ liệu todo.
    suspend fun insertTodo(todo: Todo)

    suspend fun deleteTodo(todo: Todo)

    suspend fun getTodoById(id: Int): Todo?

    fun getTodos(): Flow<List<Todo>>
}