fun Fact(num: Int, x:Int):Long{
        return if(num==1)
            x.toLong()
        else
            Fact(num-1,x*num)
    }
    fun main() {
        var n = 1
        var result = Fact(5,n)
        println("Factorial of 5 is: $result")
    }

