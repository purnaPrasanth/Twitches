package com.purnaprasanth.auth

import kotlinx.coroutines.flow.Flow

interface AuthorisationDataStore<D : AuthorisationData> {
    val observeData: Flow<D>

    suspend fun updateData(newData: D)
}
