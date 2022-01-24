package com.habitstracker.domain

class AddUserTaskUseCase(val repository: UserTaskRepository) {

    fun invoke(userTask: UserTask) = repository.addTask(userTask)

}