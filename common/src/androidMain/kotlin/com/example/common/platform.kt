package com.example.common


//actual fun getPlatformName(): String {
//    return "Android"
//}

actual class Platform actual constructor() {
    actual val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}