package demo.multiplat

fun commonSharedCode(platform: Platform): String {
    return "Common: Hi! ${platform.greetingMethod}(${platform.name})"
}

fun main(args: Array<String>) {
    println(commonSharedCode(getPlatform()))
}