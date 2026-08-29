class AsyncManager(private val state: Int = 43) {
    fun run(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 43) % 997
        }
        return acc
    }
}

fun main() {
    println(AsyncManager().run(43))
}
