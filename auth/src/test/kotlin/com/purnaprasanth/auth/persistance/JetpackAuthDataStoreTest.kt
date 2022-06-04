package com.purnaprasanth.auth.persistance

import androidx.datastore.core.DataStore
import com.purnaprasanth.auth.AuthorisationData
import io.mockk.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Test

internal class JetpackAuthDataStoreTest {
    private val dataStore: DataStore<AuthorisationData> = mockk()

    private val authorisationDataStore: JetpackAuthDataStore<AuthorisationData> =
        JetpackAuthDataStore(dataStore)

    @Test
    internal fun `should store in the provided data store`() {
        runTest {
            val mockData: AuthorisationData = mockk()
            coEvery { dataStore.updateData(any()) } returns mockData
            authorisationDataStore.updateData(mockData)
            coVerify(exactly = 1) { dataStore.updateData(any()) }
        }
    }

    @Test
    internal fun `should get observe from provided data store`() {
        val mockFlow = mockk<Flow<AuthorisationData>>()

        every { dataStore.data } returns mockFlow

        val actual = authorisationDataStore.observeData

        verify(exactly = 1) { dataStore.data }

        assert(actual === mockFlow)
    }
}
