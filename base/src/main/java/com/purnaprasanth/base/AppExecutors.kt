package com.purnaprasanth.base

import java.util.concurrent.ExecutorService

/**
 * Created by viking_93 on 01/01/2020
 **/

data class AppExecutors(
    val mainExecutorService: ExecutorService,
    val commonExecutorService: ExecutorService,
    val ioExecutorService: ExecutorService
)