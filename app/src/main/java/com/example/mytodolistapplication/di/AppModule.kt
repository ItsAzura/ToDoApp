package com.example.mytodolistapplication.di

import android.app.Application
import androidx.room.Room
import com.example.mytodolistapplication.data.TodoDatabase
import com.example.mytodolistapplication.data.TodoRepository
import com.example.mytodolistapplication.data.TodoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module //Đánh dấu đây là một Dagger module.
@InstallIn(SingletonComponent::class) //Chỉ định module này sẽ cung cấp các dependency trong Singleton component.
//Định nghĩa module cung cấp dependency cho app
object AppModule {
    @Provides // Đánh dấu phương thức này cung cấp một dependency.
    @Singleton // Đảm bảo dependency được cung cấp là singleton.
    fun provideTodoDatabase(app:Application): TodoDatabase{

        return Room.databaseBuilder( //Dùng để khởi tạo và config Room database.
            app, //Truyền vào Application object.
            TodoDatabase::class.java, //lớp Database.
            "todo_db" //Đặt tên database là "todo_db".
        ).build() //Khởi tạo và trả về đối tượng TodoDatabase.
    }

    @Provides // Đánh dấu phương thức này cung cấp một dependency.
    @Singleton // Đảm bảo dependency được cung cấp là singleton.
    //Phương thức này sẽ tạo ra một TodoRepositoryImpl với TodoDao được lấy từ TodoDatabase được inject vào.
    fun provideTodoRepository(db: TodoDatabase): TodoRepository{
        return TodoRepositoryImpl(db.dao) //Trả về đối tượng TodoRepositoryImpl vừa khởi tạo.
    }
}