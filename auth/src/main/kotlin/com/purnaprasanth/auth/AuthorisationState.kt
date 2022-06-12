package com.purnaprasanth.auth

sealed class AuthorisationState<T : AuthorisationData> {
    class UnAuthorised<T : AuthorisationData> : AuthorisationState<T>()

    class InProgress<T : AuthorisationData>(
        val data: T,
        val stage: AuthorisationStep
    ) : AuthorisationState<Nothing>()

    data class Success<T : AuthorisationData>(
        val data: AuthorisationData
    ) : AuthorisationState<T>()
}
