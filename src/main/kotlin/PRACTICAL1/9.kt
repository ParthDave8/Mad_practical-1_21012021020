fun main() {
    val numberList = ArrayList<Int>()
    println("Enter a list 5 of numbers")
    for(i in 1..5) {
        print("Enter a number: ")
        val input = readLine()
        val number = input?.toIntOrNull()

        if (number != null) {
            numberList.add(number)
        } else {
            break
        }
    }

    val maxNumber = numberList.max()
    if (maxNumber != null) {
        println("The maximum number is: $maxNumber")
    } else {
        println("The list is empty.")
    }
}
/*fun findMaxNumber(list: ArrayList<Int>): Int? {
    if (list.isEmpty()) {
        return null
    }

    var maxNumber = list[0]

    for (num in list) {
        if (num > maxNumber) {
            maxNumber = num
        }
    }

    return maxNumber
}*/

