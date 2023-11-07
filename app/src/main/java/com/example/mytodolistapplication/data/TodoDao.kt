package com.example.mytodolistapplication.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao //Đánh dấu đây là một Data Access Object
interface TodoDao {

    //TodoDao cung cấp các API để thực hiện các thao tác CRUD với dữ liệu Todo trong database.

    @Insert(onConflict = OnConflictStrategy.REPLACE) //Chèn một Todomới, nếu trùng khóa chính thì replace
    suspend fun insertTodo(todo: Todo)

    @Delete //Xóa một Todo
    suspend fun deleteTodo(todo: Todo)

    @Query("SELECT * FROM todo WHERE id = :id") //Truy vấn dữ liệu todo (có thể truyền tham số vào query)
    suspend fun getTodoById(id: Int): Todo?

    @Query("SELECT * FROM todo") //Truy vấn dữ liệu Todo (có thể truyền tham số vào query)
    fun getTodos(): Flow<List<Todo>>
}