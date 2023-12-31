package com.example.mytodolistapplication.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao //Đánh dấu đây là một Data Access Object
interface TodoDao {

    //TodoDao là interface khai báo các phương thức CRUD để thao tác với dữ liệu todo trong database.

    //TodoDao định nghĩa các phương thức để truy vấn và thao tác trực tiếp với dữ liệu todo trong database.
    @Insert(onConflict = OnConflictStrategy.REPLACE) //Chèn một Todomới, nếu trùng khóa chính thì replace
    suspend fun insertTodo(todo: Todo)

    @Delete //Xóa một Todo
    suspend fun deleteTodo(todo: Todo)

    @Query("SELECT * FROM todo WHERE id = :id") //Truy vấn dữ liệu todo (có thể truyền tham số vào query)
    suspend fun getTodoById(id: Int): Todo?

    @Query("SELECT * FROM todo") //Truy vấn dữ liệu Todo (có thể truyền tham số vào query)
    fun getTodos(): Flow<List<Todo>>
}