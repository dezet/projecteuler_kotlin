object `1` {
    fun calculate(n: Int): Int = (1..n - 1).filter { p -> p % 3 == 0 || p % 5 == 0 }.sum()

    @JvmStatic
    fun main(args: Array<String>) {
        println(`1`.calculate(1000))
    }
}