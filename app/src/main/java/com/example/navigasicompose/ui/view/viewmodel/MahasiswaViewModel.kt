package com.example.navigasicompose.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.navigasicompose.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MahasiswaViewModel : ViewModel() {
    private val _mahasiswaStateUI = MutableStateFlow(Mahasiswa())
    val mahasiswaUiState: StateFlow<Mahasiswa> = _mahasiswaStateUI.asStateFlow()


}