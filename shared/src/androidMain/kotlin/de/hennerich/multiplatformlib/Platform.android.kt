package de.hennerich.multiplatformlib

class AndroidPlatform : Platform {
    override val name: String = "Android HURENSOHN VERSION ${android.os.Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()