package com.example.a0097_roomdatabase.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import

@Entity(tableName = "tblSiswa")
data class Siswa(
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val nama : String,
    val alamat : String,
    val telpon : String
)
