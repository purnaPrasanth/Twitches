package com.purnaprasanth.twitchauthandroid.annotation

import android.net.Uri
import arrow.optics.Getter
import net.openid.appauth.AuthorizationServiceConfiguration
import javax.inject.Qualifier

@Retention(AnnotationRetention.RUNTIME)
@Qualifier
@MustBeDocumented
annotation class TwitchAuth

val authorisationEndpointGetter: Getter<AuthorizationServiceConfiguration, Uri>
    get() = Getter { authorizationServiceConfiguration -> authorizationServiceConfiguration.authorizationEndpoint }