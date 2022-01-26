package com.habitstracker.data

import androidx.room.*
import com.habitstracker.data.utils.DateTimeConverter
import java.time.LocalDate

@TypeConverters(DateTimeConverter::class)
@Dao
interface UserTaskDao {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun addTask(userTask: UserTaskDbModel)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun editTask(userTask: UserTaskDbModel)

    @Delete
    fun delete(userTask: UserTaskDbModel)

    @Query("SELECT * FROM user_tasks WHERE date = :localDate")
    fun getByDate(localDate: LocalDate) : List<UserTaskDbModel>

}