package com.example.roomtesting

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface StudentDao {
    @Query("SELECT * FROM `student-table`")
    fun printAll(): List<Student>

    @Query("SELECT * FROM `student-table` WHERE roll_no LIKE :roll LIMIT 1")
    suspend fun findByRoll(roll: Int): Student

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(student: Student)

    @Delete
    suspend fun delete(student: Student)

    @Query("DELETE FROM `student-table`")
    suspend fun deleteAll()

    @Query("UPDATE `student-table` SET first_name= :firstName,second_name= :lastName WHERE roll_no LIKE :roll")
    suspend fun update(firstName: String,lastName: String,roll: Int)

}