package com.example.remind_me

import android.app.Application


class FoodApplication : Application() {
    val db by lazy { AppDatabase.getInstance(this) }
}