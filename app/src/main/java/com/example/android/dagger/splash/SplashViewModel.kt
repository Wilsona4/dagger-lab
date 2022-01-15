package com.example.android.dagger.splash

import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import com.example.android.dagger.login.LoginActivity
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.user.UserManager
import javax.inject.Inject

class SplashViewModel @Inject constructor(val userManager: UserManager) {

    fun isRegistered(){
        if (!userManager.isUserRegistered()) {
            startActivity(Intent(this, RegistrationActivity::class.java))
            finish()
        } else {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }

}