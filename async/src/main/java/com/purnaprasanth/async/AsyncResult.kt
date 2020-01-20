package com.purnaprasanth.async

/**
 * Created by purna on 20/01/20
 **/

/**
 * An utility class to represent the result of an Async Computation
 */
sealed class AsyncResult<out T> {
    /**
     * Convenient operator to get response from AsyncResult
     */
    open operator fun invoke(): T? = null
}

/**
 * [AsyncResult] to show that Async Computation is in progress
 */
class Loading<out T> : AsyncResult<T>() {

    override fun equals(other: Any?): Boolean {
        return if (other !is Loading<*>) false else this === other
    }

    override fun hashCode(): Int {
        return "Loading".hashCode()
    }
}

/**
 * [AsyncResult] to show that Async Computation completed successfully
 */
data class Success<T>(private val data: T) : AsyncResult<T>() {
    override operator fun invoke() = data
}

/**
 * [AsyncResult] to show that Async Computation completed with error
 */
data class Error<T>(val exception: Throwable) : AsyncResult<T>()