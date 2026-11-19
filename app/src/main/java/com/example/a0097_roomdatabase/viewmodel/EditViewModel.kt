package com.example.a0097_roomdatabase.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.a0097_roomdatabase.repositori.RepositoriSiswa

class EditViewModel(
    savedStateHandle: SavedStatehandle,
    private val repositoriSiswa: RepositoriSiswa): ViewModel() {

    var uiStateSiswa by mutableStateOf(UiStateSiswa())
        private set

    pr
}