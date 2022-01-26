package com.habitstracker.domain.usecase

import com.habitstracker.domain.UserTaskRepository
import com.habitstracker.domain.model.UserTask
import java.time.LocalDate

class GetUserTasksByDateUseCase(private val repository: UserTaskRepository) {
    operator fun invoke(date: LocalDate) : List<UserTask> = repository.getTasksByDate(date)
}