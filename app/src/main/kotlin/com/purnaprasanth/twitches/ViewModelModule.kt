package com.purnaprasanth.twitches

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.purnaprasanth.twitches.baseandroid.AppViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Provider

@Module(includes = [ViewModelBinds::class])
@InstallIn(ActivityComponent::class)
class ViewModelModule {
    @Provides
    fun providesAccountViewModel(): AccountViewModel = AccountViewModel()

    @Provides
    fun provideAppViewModelFactory(
        providers: Map< @JvmSuppressWildcards Class<out ViewModel>,  @JvmSuppressWildcards Provider<ViewModel>>
    ): ViewModelProvider.Factory {
        return AppViewModelFactory(providers)
    }
}
