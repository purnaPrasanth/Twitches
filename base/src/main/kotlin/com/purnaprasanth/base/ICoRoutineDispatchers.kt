package com.purnaprasanth.base

import kotlinx.coroutines.CoroutineDispatcher

/**
 * Created by viking_93 on 05/04/2020
 **/

/**
 * A wrapper class for RxJava [CoroutineDispatcher]s in app
 *
 * @property mainDispatcher [CoroutineDispatcher] for scheduling task on UI/Main thread
 * @property commonDispatcher [CoroutineDispatcher] for computation that are heavy enough to offload from main thread
 * Ex: SharedPref, Processing Bitmap
 * @property ioDispatcher [CoroutineDispatcher] for IO related operations
 * Ex: Socket, Database
 */
interface ICoRoutineDispatchers {
    val mainDispatcher: CoroutineDispatcher
    val commonDispatcher: CoroutineDispatcher
    val ioDispatcher: CoroutineDispatcher
}
