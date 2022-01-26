package com.habitstracker.data

import android.content.Context
import com.habitstracker.domain.UserTaskRepository
import com.habitstracker.domain.model.UserTask
import java.time.LocalDate

class UserTaskRepositoryImpl(context: Context) : UserTaskRepository {

    private val userTaskDao = UserTaskDatabase.getInstance(context).userTaskDao()

    override fun addTask(userTask: UserTask) =
        userTaskDao.addTask(UserTaskDbModel.of(userTask))


    override fun deleteTask(userTask: UserTask) =
        userTaskDao.delete(UserTaskDbModel.of(userTask))


    override fun editTask(userTask: UserTask) =
        userTaskDao.editTask(UserTaskDbModel.of(userTask))


    override fun getTasksByDate(date: LocalDate): List<UserTask> {
       return userTaskDao.getByDate(date).map { it.toUserTask() }
    }
}