fun main(){
    print("enter a number: ")
    var a= readln().toInt()
    when(a){
        1->print("january")
        2->print("february")
        3 -> print("march")
        4->print("april")
        5->print("may")
        6->print("june")
        7->print("july")
        8->print("august")
        9->print("september")
        10->print("october")
        11-> print("november")
        12->print("december")
        else->print("Enter a number from 1 to 12")
    }
}