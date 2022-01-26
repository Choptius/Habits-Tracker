package com.habitstracker.domain.usecase

import com.habitstracker.domain.UserTaskRepository
import com.habitstracker.domain.model.UserTask

class AddUserTaskUseCase(private val repository: UserTaskRepository) {

  operator fun invoke(userTask: UserTask)  {

    if(userTask.id != UserTask.UNDEFINED_ID) {
      throw RuntimeException("Cannot edit this task: such a task doesn't exist yet")
    }
    repository.addTask(userTask)
  }

}