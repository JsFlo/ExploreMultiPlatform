package demo.multiplat

actual class Platform {
    actual val greetingMethod: String
        get() = "Console.log"
    actual val name: String
        get() = "JS"
}

actual fun getPlatform(): Platform {
    return Platform()
}