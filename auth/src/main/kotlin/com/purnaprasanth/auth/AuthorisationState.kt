package com.purnaprasanth.auth

sealed class AuthorisationState<T : AuthorisationData> {
    class UnAuthorised<T : AuthorisationData> : AuthorisationState<T>()

    class Authorising<T : AuthorisationData> : AuthorisationState<Nothing>()

    data class Success<T : AuthorisationData>(
        val data: AuthorisationData
    ) : AuthorisationState<T>()

    data class Error<T : AuthorisationData>(
        val authorisationError: Throwable
    ) : AuthorisationState<T>()
}
