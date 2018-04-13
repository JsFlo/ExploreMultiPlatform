package demo.multiplat

expect class Platform {
    val greetingMethod: String
    val name: String
}

expect fun getPlatform(): Platform