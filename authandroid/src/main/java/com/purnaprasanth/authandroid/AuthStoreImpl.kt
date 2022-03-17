package com.purnaprasanth.authandroid

import androidx.datastore.core.DataStore
import com.purnaprasanth.auth.AuthorisationData
import com.purnaprasanth.auth.AuthorisationDataStore
import kotlinx.coroutines.flow.Flow

class AuthStoreImpl<D : AuthorisationData>(
    private val dataStore: DataStore<D>
) : AuthorisationDataStore<D> {
    override val observeData: Flow<D>
        get() = dataStore.data

    override suspend fun updateData(newData: D) {
        dataStore.updateData {
            newData
        }
    }
}
