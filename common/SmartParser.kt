class SecureContext(private val state: Int = 22) {
    fun flush(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 22) % 997
        }
        return acc
    }
}

fun main() {
    println(SecureContext().flush(22))
}
