package demo.multiplat

actual class Platform {
    actual val greetingMethod: String
        get() = "System.out.println"
    actual val name: String
        get() = "JVM"
}

actual fun getPlatform(): Platform {
    return Platform()
}