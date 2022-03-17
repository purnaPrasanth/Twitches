package com.purnaprasanth.twitches.baseandroid

import com.purnaprasanth.base.ICoRoutineDispatchers
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

/**
 * Created by viking_93 on 26/01/2021
 **/

object AppCoroutineDispatchers : ICoRoutineDispatchers {
    override val mainDispatcher: CoroutineDispatcher
        get() = Dispatchers.Main
    override val commonDispatcher: CoroutineDispatcher
        get() = Dispatchers.Default
    override val ioDispatcher: CoroutineDispatcher
        get() = Dispatchers.IO
}
