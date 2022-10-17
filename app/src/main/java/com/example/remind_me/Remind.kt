package com.example.remind_me

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ReminderData")
class Remind (
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "Foodname") val foodname: String?,
    @ColumnInfo(name = "Calories")  val calories: Int?
)