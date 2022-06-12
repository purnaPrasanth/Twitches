package com.purnaprasanth.authandroid

import android.content.Intent
import arrow.core.Either
import arrow.optics.Getter
import net.openid.appauth.AuthorizationException
import net.openid.appauth.AuthorizationResponse

val intentAuthDataGetter: Getter<Intent, Either<AuthorizationException, AuthorizationResponse>>
    get() = Getter { dataIntent ->
        val authorizationResponse = AuthorizationResponse.fromIntent(dataIntent)
        val authorizationException = AuthorizationException.fromIntent(dataIntent)

        if (authorizationResponse == null) Either.Left(authorizationException!!)
        else Either.Right(authorizationResponse)
    }