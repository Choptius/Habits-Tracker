package com.habitstracker.data

import android.content.Context
import androidx.room.*

@Database(entities = [UserTaskEntity::class], version = 1)
abstract class UserTaskDatabase : RoomDatabase(){
    abstract fun userTaskDao(): UserTaskDao

    companion object {
        private var instance: UserTaskDatabase? = null

        fun getInstance(context: Context): UserTaskDatabase {
            instance?.let {
                return it
            }
            val db = Room.databaseBuilder(
                context,
                UserTaskDatabase::class.java,
                "user_task_db"
            ).build()

            instance = db
            return db

        }
    }
}
