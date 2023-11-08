package com.example.mytodolistapplication.data

import kotlinx.coroutines.flow.Flow

//implement TodoRepository, sử dụng TodoDao để lấy dữ liệu todo từ database.

class TodoRepositoryImpl(
    private val dao: TodoDao
    //nhận TodoDao qua constructor để sử dụng
): TodoRepository {
    //TodoRepositoryImpl implement TodoRepository và sử dụng TodoDao để thực thi các phương thức CRUD.
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