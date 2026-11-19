package com.example.a0097_roomdatabase.view.route

import com.example.a0097_roomdatabase.uicontroller.DestinasiNavigasi
import com.example.a0097_roomdatabase.R

object DestinasiDetailSiswa : DestinasiNavigasi{
    override val route = "detail_siswa"

    override val titleRes = R.string.detail_siswa

    const val itemIdArg = "idSiswa"

    val routeWithArgs = "$route/{$itemIdArg}"
}