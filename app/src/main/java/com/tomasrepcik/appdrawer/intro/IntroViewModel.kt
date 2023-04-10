package com.tomasrepcik.appdrawer.intro

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject


@HiltViewModel
class IntroViewModel @Inject constructor(): ViewModel() {

    private val _isOnboarded: MutableStateFlow<Boolean> = MutableStateFlow(false)
    var isOnboarded = _isOnboarded.asStateFlow()


    fun saveUserOnboarding() {
        _isOnboarded.value = true
    }

}