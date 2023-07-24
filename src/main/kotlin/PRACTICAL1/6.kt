fun main() {
    print("Enter the first number: ")
    val num1 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Enter the second number: ")
    val num2 = readLine()?.toDoubleOrNull() ?: 0.0
    println("Addition: ${addition(num1, num2)}")
    println("Subtraction: ${subtraction(num1, num2)}")
    println("Multiplication: ${multiplication(num1, num2)}")
    println("Division: ${division(num1, num2)}")
    println("Modulus: ${modulus(num1, num2)}")
}

fun addition(a: Double, b: Double): Double {
    return a + b
}
fun subtraction(a: Double, b: Double): Double {
    return a - b
}

fun multiplication(a: Double, b: Double): Double {
    return a * b
}
fun division(a: Double, b: Double): Double {
    if (b == 0.0) {
        throw IllegalArgumentException("Cannot divide by zero.")
    }
    return a / b
}
fun modulus(a: Double, b: Double): Double {
    if (b == 0.0) {
        throw IllegalArgumentException("Modulus divisor cannot be zero.")
    }
    return a % b
}