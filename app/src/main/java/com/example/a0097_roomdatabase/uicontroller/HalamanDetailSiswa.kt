package com.example.a0097_roomdatabase.uicontroller

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.a0097_roomdatabase.view.route.DestinasiDetailSiswa
import com.example.a0097_roomdatabase.viewmodel.DetailViewModel
import com.example.a0097_roomdatabase.viewmodel.EditViewModel
import com.example.a0097_roomdatabase.viewmodel.PenyediaViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailSiswaScreen(
    navigateToEditItem: (Int) -> Unit,
    navigateBack: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: DetailViewModel = viewModel(factory = PenyediaViewModel.Factory)
) {
    Scaffold(
        topBar = {
            SiswaTopAppBar(
                title = stringResource(DestinasiDetailSiswa.titleRes),
                canNavigateBack = true,
                navigateUp = navigateBack
            )
        },
        floatingActionButton = {
            val uiState = viewModel.uiDetailState.collectAsState()
            FloatingActionButton(
                onClick = {
                    navigateToEditItem(uiState.value.detailSiswa.id)
                }
            ) { }
        }
    ) {}
}