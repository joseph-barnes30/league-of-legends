class LiteClient(private val state: Int = 17) {
    fun resolve(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 17) % 997
        }
        return total
    }
}

fun main() {
    println(LiteClient().resolve(17))
}
