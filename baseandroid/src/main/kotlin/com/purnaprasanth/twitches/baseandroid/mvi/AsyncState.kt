package com.purnaprasanth.twitches.baseandroid.mvi

/**
 * Created by viking_93 on 06/07/2021
 **/

sealed class AsyncState<T : Any> {
    abstract val data: T

    data class Loading<T : Any>(override val data: T) : AsyncState<T>()
    data class Success<T : Any>(override val data: T) : AsyncState<T>()
    data class Error<T : Any>(override val data: T, val error: Throwable) : AsyncState<T>()
}
