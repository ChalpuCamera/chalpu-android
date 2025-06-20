package com.chalpu.chalpu_android

import android.app.Application
import android.util.Log
import androidx.camera.camera2.Camera2Config
import androidx.camera.core.CameraSelector
import androidx.camera.core.CameraXConfig

class ChalpuApplication : Application(), CameraXConfig.Provider {
    
    override fun onCreate() {
        super.onCreate()
        Log.d("ChalpuApplication", "ChalpuApplication onCreate called")
    }
    
    override fun getCameraXConfig(): CameraXConfig {
        Log.d("ChalpuApplication", "CameraX config being set with back camera limiter")
        return CameraXConfig.Builder.fromConfig(Camera2Config.defaultConfig())
            .setAvailableCamerasLimiter(CameraSelector.DEFAULT_BACK_CAMERA)
            .build()
    }
} 