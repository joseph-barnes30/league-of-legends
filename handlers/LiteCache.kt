class BatchEngine(private val state: Int = 80) {
    fun collect(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 80) % 997
        }
        return value
    }
}

fun main() {
    println(BatchEngine().collect(80))
}
