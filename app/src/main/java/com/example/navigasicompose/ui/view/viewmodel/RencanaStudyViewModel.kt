package com.example.navigasicompose.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.navigasicompose.model.RencanaStudi
import kotlinx.coroutines.flow.MutableStateFlow

class RencanaStudyViewModel : ViewModel() {
    private val _krsState = MutableStateFlow(RencanaStudi())
}