package com.example.a0097_roomdatabase

import android.app.Application
import androidx.compose.ui.autofill.ContentType
import com.example.a0097_roomdatabase.repositori.ContainerApp
import com.example.a0097_roomdatabase.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    /**
     * AppContainer instance digunakan oleh kelas kelas lainnya untuk mendapatkan depedensi
     */
    lateinit var container : ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}