package demo.multiplat

actual class Platform {
    actual val greetingMethod: String
        get() = "Toast"
    actual val name: String
        get() = "Android"
}

actual fun getPlatform(): Platform {
    return Platform()
}