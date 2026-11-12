package com.example.a0097_roomdatabase.repositori

import

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>

    suspend fun insertSiswa(siswa: Siswa)
}