package com.example.a0097_roomdatabase.room

import androidx.room.Insert
import androidx.room.Query

interface SiswaDao {
    @Insert(onConflict = onConflictStrategy.IGNORE)
    suspend fun insert(siswa: Siswa)

}