package com.example.core.presentation.util

import kotlinx.coroutines.CoroutineScope

expect abstract class KMViewModel() {
    val coroutineScope: CoroutineScope
    fun dispose()
    protected open fun onCleared()
}