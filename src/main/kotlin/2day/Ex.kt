package `2day`

class Ex {

}

//fun main() {
//    var temp = Temp("hi", 29)
//    temp.dowhen(1);
//
//}
//
//class Temp(var name: String, var age: Int){
//    init {
//        print("$name 입니다.")
//    }
//
//    fun dowhen(a: Any){
//        when(a){
//            is String -> println("String 타입")
//            1 -> println("1 입니다.")
//            "s" -> println("s입니다.")
//        }
//    }
//}

//fun main(){
//    var a: Int = 0;
//    while (a < 10){
//        var c: Int = a++
//        print(c)
//        print(a)
//    }
//}

class Person(var name: String, var age: Int){
    // 무조건 실행, 보조 생성자를 통해서 age 값이 들어오는 경우 ${this.age}를 하면 보조 생성자에 들어온 값이 들어옴
    init {
        println("제 이름은 ${this.name}입니다. 나이는 ${this.age}살입니다.")
    }

    //
    constructor(name: String): this(name, 29){
        println("제 나이는 ${this.age}살 입니다.")

    }
}

fun main(){
    var person = Person("j")
}