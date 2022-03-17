package com.purnaprasanth.auth

sealed class AuthorisationState<T : AuthorisationData> {
    object UnAuthorised : AuthorisationState<Nothing>()

    data class Success<T : AuthorisationData>(
        val data: AuthorisationData
    ) : AuthorisationState<T>()

    data class Error<T : AuthorisationData>(
        val authorisationError: Throwable
    ) : AuthorisationState<T>()
}
