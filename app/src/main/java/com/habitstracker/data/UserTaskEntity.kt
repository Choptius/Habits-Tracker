package com.habitstracker.data

import androidx.room.*
import java.time.LocalDate
import java.time.LocalTime

@Entity(tableName = "user_tasks")
@TypeConverters(DateTimeConverter::class)

data class UserTaskEntity(
    @PrimaryKey val id: Int,
    val name: String,
    val description: String,
    val date: LocalDate,
    val time: LocalTime,
    val donePercent: Int = 0
) {

//    fun toUserTask() : UserTask {
//        return UserTask(
//            id = id,
//            name = name,
//            description = description,
//            dateTime = LocalDateTime.of(date, time),
//            donePercent = donePercent
//        )
//    }
}
