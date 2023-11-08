package com.example.mytodolistapplication.ui.theme.todo_list

import com.example.mytodolistapplication.data.Todo
//định nghĩa các sự kiện có thể xảy ra ở màn hình todo list screen.
sealed interface TodoListEvent {
    data class DeleteTodo(val todo: Todo):TodoListEvent
    data class OnDoneChange(val todo: Todo, val isDone: Boolean):TodoListEvent
    object OnUndoDeleteClick: TodoListEvent
    data class OntodoClick(val todo: Todo):TodoListEvent
    object OnAddTodoClick: TodoListEvent

    //note: - data class: dùng cho các sự kiện cần mang thêm dữ liệu
    //      - object: dùng cho các sự kiện đơn giản không cân thêm tham số
}