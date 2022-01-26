package com.habitstracker.data

import android.content.Context
import androidx.room.*
import com.habitstracker.domain.model.UserTask

@Database(entities = [UserTask::class], version = 1)
abstract class UserTaskDatabase : RoomDatabase(){
    abstract fun userTaskDao(): UserTaskDao

    companion object {
        private var instance: UserTaskDatabase? = null
        private val LOCK = Any()
        private const val DB_NAME = "user_task_db"

        fun getInstance(context: Context): UserTaskDatabase {
            instance?.let {
                return it
            }
            synchronized(LOCK) {
                instance?.let {
                    return it
                }
                val db = Room.databaseBuilder(
                    context,
                    UserTaskDatabase::class.java,
                    DB_NAME
                ).build()

                instance = db
                return db
            }

        }
    }
}
