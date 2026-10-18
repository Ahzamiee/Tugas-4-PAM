
package com.example.calculator

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class CalViewModel : ViewModel() {

    private val _count = MutableStateFlow(0)
    val count: StateFlow<Int> = _count

    fun up() {
        _count.update { it + 1 }
    }

    fun down() {
        _count.update { it - 1 }
    }

    fun reset() {
        _count.value = 0
    }
}
