package com.example.superchat

import android.app.Application
import com.example.superchat.core.log.timber.TimberHelper
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SuperChatApp: Application() {
    override fun onCreate() {
        super.onCreate()

        TimberHelper.setupLogger()
    }
}