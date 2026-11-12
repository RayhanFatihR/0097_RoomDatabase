package com.example.a0097_roomdatabase.repositori

import com.example.a0097_roomdatabase.room.DatabaseSiswa
import

interface ContainerApp {
    val repositoriSiswa: RepositoriSiswa
}

class ContainerDataApp(private val context: Context): ContainerApp {
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(siswaDao = DatabaseSiswa.getDatabase(context).siswaDao())
    }
}