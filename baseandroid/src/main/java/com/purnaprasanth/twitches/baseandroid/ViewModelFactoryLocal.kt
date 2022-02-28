package com.purnaprasanth.twitches.baseandroid

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidedValue
import androidx.compose.runtime.compositionLocalOf
import androidx.lifecycle.ViewModelProvider

object LocalViewModelFactory {
    private val LocalViewModelFactory = compositionLocalOf<ViewModelProvider.Factory?> { null }

    val current: ViewModelProvider.Factory?
        @Composable
        get() = LocalViewModelFactory.current

    infix fun provides(
        viewModelFactory: ViewModelProvider.Factory
    ): ProvidedValue<ViewModelProvider.Factory?> = LocalViewModelFactory.provides(viewModelFactory)
}