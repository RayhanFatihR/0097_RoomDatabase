package com.example.a0097_roomdatabase.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.a0097_roomdatabase.repositori.RepositoriSiswa
import com.example.a0097_roomdatabase.view.route.DestinasiDetailSiswa

class DetailViewModel (
    savedStateHandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa) : ViewModel(){

    private val idSiswa: Int = checkNotNull(savedStateHandle[DestinasiDetailSiswa.itemIdArg])
}
