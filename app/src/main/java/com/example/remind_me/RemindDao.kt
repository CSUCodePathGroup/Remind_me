package com.example.remind_me

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface RemindDao {
    // Query to get all data from the table HealthData
    @Query("SELECT * FROM ReminderData")
    fun getAll(): Flow<List<Remind>>

    // Insert new item to the HealthData table
    @Insert
    fun insertAll(vararg food: Remind)

    // Delete all data from HealthTable
    @Query("DELETE FROM ReminderData")
    fun deleteAll()

    // Delete single item from table
    @Delete
    fun deleteItem(food: Remind)

    //  Get the highest value
    @Query("SELECT MAX(Calories) FROM ReminderData")
    fun getHighestCal(): Flow<Int>
}