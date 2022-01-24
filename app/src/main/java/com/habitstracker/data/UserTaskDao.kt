package com.habitstracker.data

import androidx.room.*
import java.time.LocalDate

@TypeConverters(DateTimeConverter::class)
@Dao
interface UserTaskDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addTask(userTask: UserTaskEntity)

    @Delete
    fun delete(userTask: UserTaskEntity)

    @Query("SELECT * FROM user_tasks WHERE date = :localDate")
    fun getByDate(localDate: LocalDate) : List<UserTaskEntity>

}