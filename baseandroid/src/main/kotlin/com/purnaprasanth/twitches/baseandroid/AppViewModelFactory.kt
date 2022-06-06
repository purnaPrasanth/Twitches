package com.purnaprasanth.twitches.baseandroid

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.viewModel
import javax.inject.Provider

@Suppress("UNCHECKED_CAST")
class AppViewModelFactory(
    private val viewModelProviders: Map<Class<out ViewModel>, Provider<ViewModel>>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return (viewModelProviders[modelClass]
            ?: throw IllegalStateException(
                "provider is not found for ViewModel of type ${modelClass.simpleName}"
            )).get() as T
    }
}

@Composable
inline fun <reified VM : ViewModel> myViewModel(
    viewModelStoreOwner: ViewModelStoreOwner = checkNotNull(LocalViewModelStoreOwner.current) {
        "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
    },
    key: String? = null,
    viewModelFactory: ViewModelProvider.Factory = checkNotNull(LocalViewModelFactory.current) {
        "No ViewModelFactory was provided via LocalViewModelFactor"
    }
): VM = viewModel(VM::class.java, viewModelStoreOwner, key, viewModelFactory)
