package com.example.android.dagger.di

import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import dagger.Subcomponent

@LoggedInUserScope
@Subcomponent
interface UserComponent {
    @Subcomponent.Factory
    interface Factory{
        fun create(): UserComponent
    }

    fun inject(activity: MainActivity)
    fun inject(activity: SettingsActivity)
}