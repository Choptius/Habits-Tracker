package com.habitstracker.domain

import java.time.LocalDateTime

data class UserTask(
    val name: String,
    val description: String,
    val dateTime: LocalDateTime,
    val donePercent: Int = 0,
    var id: Int,
) {
    init {
        if(donePercent !in 0..100) {
            throw RuntimeException("Percent value isn't valid")
        }

    }

}


