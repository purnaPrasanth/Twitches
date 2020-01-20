package com.purnaprasanth.base

import io.reactivex.subjects.BehaviorSubject

/**
 * Created by viking_93 on 07/02/2020
 **/

/**
 * The source for [UserAuthState] of the user
 */
interface UserAuthStateSource {
    val authSource: BehaviorSubject<UserAuthState>
}