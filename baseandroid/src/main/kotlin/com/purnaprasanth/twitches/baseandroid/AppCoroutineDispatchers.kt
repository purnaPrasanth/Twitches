package com.purnaprasanth.twitches.baseandroid

import com.purnaprasanth.base.ICoRoutineDispatchers
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

/**
 * Created by viking_93 on 26/01/2021
 **/

data class AppCoroutineDispatchers(
    override val mainDispatcher: CoroutineDispatcher = Dispatchers.Main,
    override val commonDispatcher: CoroutineDispatcher = Dispatchers.Default,
    override val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : ICoRoutineDispatchers
