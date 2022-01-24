package com.habitstracker.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.habitstracker.R
import com.habitstracker.data.UserTaskDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(
            this,
            UserTaskDatabase::class.java,
            "user_task_db"
        ).build()
    }
}