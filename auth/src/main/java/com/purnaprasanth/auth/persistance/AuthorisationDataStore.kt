package com.purnaprasanth.auth.persistance

import com.purnaprasanth.auth.AuthorisationData
import kotlinx.coroutines.flow.Flow

interface AuthorisationDataStore<D : AuthorisationData> {
    val observeData: Flow<D>

    suspend fun updateData(newData: D)
}
