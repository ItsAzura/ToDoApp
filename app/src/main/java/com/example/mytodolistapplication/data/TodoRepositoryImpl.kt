package com.example.mytodolistapplication.data

import kotlinx.coroutines.flow.Flow

//implementation của TodoRepository
//sử dụng TodoDao để truy xuất dữ liệu Todo từ database.
class TodoRepositoryImpl(
    private val dao: TodoDao
    //nhận TodoDao qua constructor để sử dụng
): TodoRepository {

    override suspend fun insertTodo(todo: Todo) {
        dao.insertTodo(todo)
    }

    override suspend fun deleteTodo(todo: Todo) {
        dao.deleteTodo(todo)
    }

    override suspend fun getTodoById(id: Int): Todo? {
        return dao.getTodoById(id)
    }

    override fun getTodos(): Flow<List<Todo>> {
        return dao.getTodos()
    }
}