class BatchHandler(private val state: Int = 94) {
    fun collect(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 94) % 997
        }
        return result
    }
}

fun main() {
    println(BatchHandler().collect(94))
}
