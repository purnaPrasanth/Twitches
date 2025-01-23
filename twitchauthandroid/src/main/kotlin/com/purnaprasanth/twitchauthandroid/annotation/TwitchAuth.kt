package com.purnaprasanth.twitchauthandroid.annotation

import android.net.Uri
import arrow.optics.Getter
import net.openid.appauth.AuthorizationServiceConfiguration

val authorisationEndpointGetter: Getter<AuthorizationServiceConfiguration, Uri>
    get() = Getter { authorizationServiceConfiguration -> authorizationServiceConfiguration.authorizationEndpoint }