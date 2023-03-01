package `1day`

class Ex {
}

//fun main() {
//    var a: Int = 3
//    a = 123
//    print(a)
//}
//
//fun main() {
//    val a: Int = 4
////    a = 123
//    print(a)
//}
//
//fun main() {
//    var a: Int? = 2
//    var b: String = a.toString()
//    print(b)
//}
//fun main() {
//    var a: Int = 5;
//    print(a)
//}
//fun main() {
//    var intArr: Array<Int> = arrayOf(1, 2, 3, 4, 5)
//    var intArr2 = arrayOfNulls<Int>(5)
//
//    print(intArr[0])
//    print(intArr[1])
//    print(intArr[2])
//    print(intArr[3])
//    print(intArr[4])
//
//    print(intArr2[0])
//    print(intArr2[1])
//    print(intArr2[2])
//    print(intArr2[3])
//    print(intArr2[4])
//}

//fun add(a: Int, b: Int, c: Int): Int{
//    return a + b + c;
//}
//fun main(){
//    var a: Int = 1
//    var b: Int = 2
//    var c: Int = 3
//    print(add(a, b, c))
//
//}
//
//fun add(a: Int, b: Int, c: Int) = a + b + c


//fun main(){
//    var a =  7
//    var b = 5
//
//    if(a > b){
//        println("a가 더 큼")
//    } else {
//        print("b가 더 크거나 같음")
//    }
//}
//
//fun main() {
//    exWhen(2)
//}
//
//fun exWhen(a: Any) {
//    when (a) {
//        1 -> print(a)
//        2 -> print(7)
//        else -> print(5)
//    }
//}
//
//fun exWhen(a: Any) {
//    var b =
//    when (a) {
//        1 -> a
//        2 -> 7111
//        else -> 5
//    }
//    print(b)
//}
//fun main(){
//    var a: Int = 0
//    while(a < 6){
//        println(a)
//        a++
//    }
//}

//fun main(){
//    for(i in 0..3){
//        print(i)
//        print(" ")
//    }
//
//    for (i in 5 downTo 0 step 2){
//        print(i)
//        print(" ")
//    }
//
//    for (i in 5 downTo 0){
//        print(i)
//        print(" ")
//    }
//
//    for (i in 'a'..'e'){
//        print(i)
//        print(" ")
//    }
//}
//fun main(){
//
//    for(i in 5 downTo 0){
//        if(i == 2){
//            break;
//        }
//        print(i)
//    }
//}
//
//fun main(){
//    awd@for(i in 0..6){
//        for(j in 'a'..'e'){
//            if(i == 2){
//                break@awd
//            }
//            print(i);
//            print(j);
//        }
//    }
//}


//fun main(){
//    var temp = Temp("j", 29)
//    temp.introduction()
//}
//
//class Temp(var name: String,var age: Int){
//    fun introduction(){
//        println("나는 $name 라고 해, 현재 $age 살이야")
//    }
//}

//fun main(){
//    var Temp = Temp("j", 29)
//}
//
//class Temp(var name: String, var age: Int){
//    init{
//        print("내 이름을 초기화하는 김에 알려줄게 잘 기억해 ! $name 라고 해 ! 나이는 $age 살이야")
//    }
//}

fun main(){
    var t = Temp("j")

}

class Temp(var name: String, var age: Int){

    constructor(name: String): this(name, 29)
    init{
        print("초기화 중입니다. 이름은 $name 이고, 나이는 $age 입니다.")
    }
}





