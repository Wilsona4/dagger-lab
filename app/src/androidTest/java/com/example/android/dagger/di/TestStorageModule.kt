package com.example.android.dagger.di

import androidx.test.services.storage.TestStorage
import com.example.android.dagger.storage.FakeStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

@Module
interface TestStorageModule {
    @Binds
    abstract fun provideStorage(storage: FakeStorage): Storage
}