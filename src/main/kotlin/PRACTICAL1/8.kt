fun main() {
    val x= arrayOf(1,2,3)
    println("Using arrayOf method: "+x.contentToString())

    val y= Array<Int>(5) {0}
    println("Using Array<>() method: "+y.contentToString())

    val z= Array<Int>(5) {i: Int -> i }
    println("Using lambda function: "+z.contentToString())

    val m= IntArray(5){3}
    val arrAsStrin = m.joinToString (" ")
    println("Using IntArray method: "+arrAsStrin)

    val b: IntArray = intArrayOf(1,2,3,4,5)
    val arrAsString = b.joinToString(" ")
    println("Using intArrayOf method: "+arrAsString)

        val inputArray = arrayOf(
                intArrayOf(1, 3),
                intArrayOf(4, 5),
                intArrayOf(6, 7)
        )

        val a = IntArray(6)


        // Prompt the user to enter values for each index
        for (i in 1..4) {
            print("a[$i] = ")
            val input = readLine()?.toIntOrNull()
            if (input != null) {
                a[i] = input
            } else {
                println("Invalid input. Please enter a valid integer.")
                return
            }
        }

        // Populate the rest of the array using the inputArray values
        a[0] = inputArray[0][0] + inputArray[0][1]
        a[5] = inputArray[2][0] - inputArray[1][1]

        // Print the entered array
        println("Entered Array:")
        println(a.joinToString(", "))
    }



