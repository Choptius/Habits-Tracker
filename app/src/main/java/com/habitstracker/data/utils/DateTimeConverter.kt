package com.habitstracker.data.utils

import androidx.room.TypeConverter
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

class DateTimeConverter {

    @TypeConverter
    fun localDateToString(date: LocalDate) : String = date.toString()

    @TypeConverter
    fun localDateFromString(string: String) : LocalDate = LocalDate.parse(string)

    @TypeConverter
    fun localTimeToInt(time: LocalTime) : Int = time.toSecondOfDay()

    @TypeConverter
    fun localTimeFromInt(seconds: Int) : LocalTime = LocalTime.ofSecondOfDay(seconds.toLong())

}