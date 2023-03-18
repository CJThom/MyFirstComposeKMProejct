package com.example.common.util

import kotlinx.coroutines.CoroutineScope

expect abstract class KMViewModel() {
    val coroutineScope: CoroutineScope
    fun dispose()
    protected open fun onCleared()
}