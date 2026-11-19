package com.example.a0097_roomdatabase.view.route

import com.example.a0097_roomdatabase.uicontroller.DestinasiNavigasi
import com.example.a0097_roomdatabase.R

object DestinasiEditSiswa : DestinasiNavigasi {
    override val route = "item_edit"

    override val titleRes = R.string.edit_siswa

    const val itemIdArg = "idSiswa"

    val routeWithArgs = "$route/{$itemIdArg}"

}