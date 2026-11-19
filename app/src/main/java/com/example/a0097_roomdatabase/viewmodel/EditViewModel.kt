package com.example.a0097_roomdatabase.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.a0097_roomdatabase.repositori.RepositoriSiswa
import com.example.a0097_roomdatabase.view.route.DestinasiDetailSiswa
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

class EditViewModel(
    savedStateHandle: SavedStatehandle,
    private val repositoriSiswa: RepositoriSiswa): ViewModel() {

    var uiStateSiswa by mutableStateOf(UiStateSiswa())
        private set

    private val idSiswa: Int = checkNotNull(savedStateHandle[DestinasiDetailSiswa.itemIdArg])
        init{
            viewModelScope.launch {
                uiStateSiswa = repositoriSiswa.getSiswaStream(idSiswa)
                    .filterNotNull()
                    .first()
                    .toUiStateSiswa(true)
            }
        }
}