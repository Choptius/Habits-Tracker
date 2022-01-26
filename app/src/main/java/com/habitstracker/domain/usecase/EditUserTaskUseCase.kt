package com.habitstracker.domain.usecase

import com.habitstracker.domain.UserTaskRepository
import com.habitstracker.domain.model.UserTask

class EditUserTaskUseCase(private val repository: UserTaskRepository) {
    operator fun invoke(task: UserTask) {
        if(task.id == UserTask.UNDEFINED_ID) {
            throw RuntimeException("Cannot edit this task: such a task doesn't exist yet")
        }
        repository.editTask(task)
    }
}