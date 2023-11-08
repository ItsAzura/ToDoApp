package com.example.mytodolistapplication.util

import android.graphics.Mesh

//định nghĩa các sự kiện có thế xảy ra trong ứng dụng
sealed interface UiEvent {
    object PopBackStack: UiEvent
    //đại diện cho sự kiện quay lại màn hình trước đó
    data class Navigate(val route: String): UiEvent
    //đại diện cho sự kiện chuyển sang màn hình mới.
    //có tham số là đường dẫn tới màn hình cần điều hướng tới
    data class ShowSnackbar( //đại diện cho hiện thị thông báo trong snackbar
        val message: String, //nội dung tin nhắn
        val action:String? = null //text cho nút action
    ):UiEvent
}