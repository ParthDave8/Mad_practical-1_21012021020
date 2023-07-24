class Car(
        val type: String,
        val model: String,
        val price: Double,
        val owner: String,
        var KmDrive: Int
) {
    fun getOriginalCarPrice(): Double {
        return price
    }
    fun getCurrentCarPrice(): Double {
        val depreciationRate = 0.1 // 10% depreciation per 10,000 miles
        val depreciationFactor = (KmDrive / 10000) * depreciationRate
        return price - (price * depreciationFactor)
    }
    fun displayCarInfo() {
        println("Car Information:")
        println("Type: $type")
        println("Model: $model")
        println("Original Price: ${getOriginalCarPrice()}")
        println("Current Price: ${getCurrentCarPrice()}")
        println("Owner: $owner")
        println("Miles Driven: $KmDrive\n\n")
    }
}

fun main() {
    val car = Car("SUV", "Jeep Wrangler", 30000.0, "Parth dave", 15000)
    car.displayCarInfo()

    println("Car Type: ${car.type}")
    println("Car Model: ${car.model}")
    println("Car Owner: ${car.owner}")
    println("Miles Driven: ${car.KmDrive}")
}
