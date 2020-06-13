package com.purnaprasanth.base

import kotlinx.coroutines.flow.Flow

/**
 * Created by viking_93 on 07/02/2020
 **/

/**
 * The source for [UserAuthState] of the user
 */
interface UserAuthStateSource {
    val authSource: Flow<UserAuthState>
}