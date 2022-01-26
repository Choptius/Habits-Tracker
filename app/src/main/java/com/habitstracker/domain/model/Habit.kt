package com.habitstracker.domain.model

class Habit(
   val durationInMonths: Int = NO_DURATION,

) {
    companion object {
        const val NO_DURATION = -1
    }
}

