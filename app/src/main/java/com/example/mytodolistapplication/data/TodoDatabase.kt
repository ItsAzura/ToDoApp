package com.example.mytodolistapplication.data

import androidx.room.Database
import androidx.room.RoomDatabase

//đánh dấu đây là database sử dụng Room
@Database (
    entities = [Todo::class], //chỉ ra lớp Todo sẽ được lưu trữ trong database này
    version = 1 //chỉ phiên bản schema của database
)

abstract class TodoDatabase: RoomDatabase() { //kế thừa từ RoomDatabase

    abstract val dao: TodoDao //dao trả về đối tượng TodoDao để truy vấn và thao tác với dữ liệu Todo
}