package com.example.roomtesting

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Student-table")
data class Student(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "first_name") val firstName: String?,
    @ColumnInfo(name = "second_name") val secondName: String?,
    @ColumnInfo(name = "roll_no") val rollNo: Int?,
)
