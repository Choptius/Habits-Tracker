package com.habitstracker.domain.model

import java.time.LocalDate
import java.time.LocalTime


data class UserTask(
    val id: Int = UNDEFINED_ID,
    val name: String,
    val description: String,
    val date: LocalDate,
    val beginTime: LocalTime,
    val endTime: LocalTime,
    val donePercent: Int = 0
) {
    companion object {
        const val UNDEFINED_ID = -1
    }
}


