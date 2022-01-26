package com.habitstracker.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.habitstracker.data.utils.DateTimeConverter
import com.habitstracker.domain.model.UserTask
import java.time.LocalDate
import java.time.LocalTime

@Entity(tableName = "user_tasks")
@TypeConverters(DateTimeConverter::class)

data class UserTaskDbModel(
    @PrimaryKey(autoGenerate = true) val id: Int = UNDEFINED_ID,
    val name: String,
    val description: String,
    val date: LocalDate,
    val beginTime: LocalTime,
    val endTime: LocalTime,
    val donePercent: Int = 0
) {

    fun toUserTask(): UserTask =
        UserTask(id, name, description, date, beginTime, endTime, donePercent)


    companion object {

        const val UNDEFINED_ID = -1

        fun of(userTask: UserTask) = UserTaskDbModel(
            id = userTask.id,
            name = userTask.name,
            description = userTask.description,
            date = userTask.date,
            beginTime = userTask.beginTime,
            endTime = userTask.endTime,
            donePercent = userTask.donePercent
        )

    }
}