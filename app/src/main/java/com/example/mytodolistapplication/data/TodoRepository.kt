package com.example.mytodolistapplication.data

import kotlinx.coroutines.flow.Flow

//interface TodoRepository cung cấp các phương thức để truy xuất dữ liệu todo từ các nguồn dữ liệu khác nhau (local, remote).
interface TodoRepository {

    suspend fun insertTodo(todo: Todo)

    suspend fun deleteTodo(todo: Todo)

    suspend fun getTodoById(id: Int): Todo?

    fun getTodos(): Flow<List<Todo>>
}