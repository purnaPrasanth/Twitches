package com.purnaprasanth.auth.persistance

import androidx.datastore.core.DataStore
import com.purnaprasanth.auth.AuthorisationData
import kotlinx.coroutines.flow.Flow

class JetpackAuthDataStore<D : AuthorisationData>(
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
