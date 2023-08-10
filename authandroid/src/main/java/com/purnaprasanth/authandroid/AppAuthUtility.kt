package com.purnaprasanth.authandroid

import android.net.Uri
import arrow.core.Either
import arrow.core.raise.Effect
import arrow.core.raise.effect
import net.openid.appauth.AuthorizationException
import net.openid.appauth.AuthorizationService
import net.openid.appauth.AuthorizationServiceConfiguration
import net.openid.appauth.TokenRequest
import net.openid.appauth.TokenResponse
import kotlin.coroutines.intrinsics.suspendCoroutineUninterceptedOrReturn
import kotlin.coroutines.resume

fun fetchAuthServiceConfigEffect(
    authServerUri: Uri
): Effect<AuthorizationException, AuthorizationServiceConfiguration> = effect {
    fetchAuthServiceConfig(authServerUri).bind()
}

fun AuthorizationService.fetchTokenEffect(
    tokenRequest: TokenRequest
): Effect<AuthorizationException, TokenResponse> = effect {
    this@fetchTokenEffect.fetchToken(tokenRequest).bind()
}

private suspend fun fetchAuthServiceConfig(
    uri: Uri
): Either<AuthorizationException, AuthorizationServiceConfiguration> {
    return suspendCoroutineUninterceptedOrReturn { continuation ->
        AuthorizationServiceConfiguration.fetchFromIssuer(uri,
            AuthorizationServiceConfiguration.RetrieveConfigurationCallback { serviceConfiguration, ex ->
                if (ex != null) {
                    continuation.resume(Either.Left(ex))
                    return@RetrieveConfigurationCallback
                }

                continuation.resume(Either.Right(serviceConfiguration!!))
            })
    }
}

private suspend fun AuthorizationService.fetchToken(
    tokenRequest: TokenRequest
): Either<AuthorizationException, TokenResponse> {
    return suspendCoroutineUninterceptedOrReturn { continuation ->
        performTokenRequest(tokenRequest) { response, ex ->
            if (ex != null) {
                continuation.resume(Either.Left(ex))
                return@performTokenRequest
            }

            continuation.resume(Either.Right(response!!))
        }
    }
}
