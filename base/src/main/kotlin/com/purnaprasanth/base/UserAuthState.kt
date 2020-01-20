package com.purnaprasanth.base

/**
 * Created by viking_93 on 01/01/2020
 **/

/**
 * Different Login States of a user in the Application
 */
sealed class UserAuthState {
    /**
     * When the User is LoggedIn
     */
    object Autherized : UserAuthState()

    /**
     * When the user is LoggedOut
     *
     * By Default, user should be in Guest Mode
     */
    object Guest : UserAuthState()
}