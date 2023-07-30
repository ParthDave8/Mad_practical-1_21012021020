fun main(){
    var a2= arrayOf(5,4,3,2,1)
    var a3= intArrayOf(8,9,7)
    var a4=Array(5){0}
    println("creste Array using arrayof=${a2.contentToString()}\n")
    println("creste Array using intarrayof=${a3.contentToString()} \n")
    println("creste Array using Arry=${a4.contentToString()}\n\n")
    var a1= arrayListOf<Int>()
    print("Enter your array size=")
    var size= readln().toInt()
    println("enter your $size elements!!")
    for(i in 0..(size-1)){
        print("enter a[$i]=")
        a1.add(readln().toInt())
    }
    println("Before sorting array is")
    a1.forEach{print(it,)}
    println("\nafter sorting using build-in function\n")
    a1.sort()
    a1.forEach{print(it,)}
    var a5= arrayOf(5,4,3,2,1)
    println("\nBefore sorting array is\n")
    a5.forEach { print(it,) }
    var temp:Int
    for(i in 0 .. size-1){
        for(j in 0 .. i){
            if(a5[i]<a5[j]){
                temp=a5[i]
                a5[i]=a5[j]
                a5[j]=temp
            }
        }
    }
    println("\nafter sorting without using build-in function\n")
    a5.forEach { print(it,) }
}
