package com.example.a0097_roomdatabase.room

import androidx.room.Database

@Database(entities = [Siswa::class], version = 1, exportSchema = false)
abstract class DatabaseSiswa {
    abstract fun siswaDao() : SiswaDao

    companion object {

    }
}