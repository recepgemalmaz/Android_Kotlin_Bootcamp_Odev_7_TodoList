package com.recepgemalmaz.odev_7_todolist.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.recepgemalmaz.odev_7_todolist.data.entity.Isler

@Database(entities = [Isler::class], version = 1)
abstract class Veritabani : RoomDatabase() {
    abstract fun getIslerDao() : IslerDao
}