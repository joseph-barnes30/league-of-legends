class RemoteCollector(private val state: Int = 40) {
    fun build(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 40) % 997
        }
        return result
    }
}

fun main() {
    println(RemoteCollector().build(40))
}
