package com.habitstracker.domain

import java.time.LocalDate

interface UserTaskRepository {

    fun addTask(userTask: UserTask)

    fun deleteTask(userTask: UserTask)

    fun editTask(userTask: UserTask)

    fun getTasksByDate(date: LocalDate) : List<UserTask>

}