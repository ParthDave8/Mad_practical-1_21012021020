fun factorial(n: Int): Int {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}
fun factorialTailRec(n: Int, result: Int = 1): Int {
    return if (n == 0 || n == 1) {
        result
    } else {
        factorialTailRec(n - 1, n * result)
    }
}
fun main() {
    val num = 5
    val factorialResult = factorial(num)
    val factorialTailRecResult = factorialTailRec(num)

    println("Factorial of $num using recursion: $factorialResult")
    println("Factorial of $num using tail recursion: $factorialTailRecResult")
}