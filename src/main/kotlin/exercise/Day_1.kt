package exercise

class Day_1 {
}

// 변수 선언
// 1. 가변 (var) -> 값을 변경할 수 있음
// 2. 불변 (val) -> 값을 초기화한 후에 변경할 수 없음


//fun main() {
//    var x: Int = 10
//    val y: Int = 10
//
//    x = 9
//    y = 9 //에러
//}


// 자료형
// Java와는 달리 기본형 타입 Int, Boolean, Double 등의 타입이 모두 객체로 취급이 되고,
// 내장 함수와 프로퍼티를 갖는다.
// 자료형은 자동으로 타입 추론이 가능함

//fun main() {
//    var a: Int = 1
//    var b = 1 // 자동 타입 추론(리터럴을 보고 파악)
//    var c: Double = 3.14
//    var d = 3.14 //자동 타입 추론(리터럴을 보고 파악)
//}

// 함수
// 반환값이 없으면 함수명 뒤에 아무것도 입력하지 않아도 됨
// 반환값이 있으면, 함수명 뒤에 반환타입을 명시해줘야 함

//fun sum(a: Int, b: Int, c: Int): Int{
//    return a + b + c
//}
//
//fun print(a: Int, b: Int){
//    print(a)
//    print(b)
//}

// 반복문
// For이나 while을 사용

//fun main(){
//    val numbers = listOf(1, 2, 3, 4, 5)
//
//    for(number in numbers){
//        println(number)
//    }
//
//    for(i in 1..5){
//        print(i)
//    }
//}

// 클래스
// 코틀린에서는 클래스의 멤버함수와 프로퍼티가 기본적으로 public(접근 제한 없음)이 선언된다.

//class Animal(var name: String, var age: Int){
//
//    fun introduce(){
//        println("${this.name}, ${this.age}")
//    }
//}
//
//fun main(){
//    var animal = Animal("Dodo", 7)
//
//    animal.introduce()
//}


// 생성자
// Kotlin은 생성자가 조금 어려움

// 이 경우처럼 var나 val이 같이 쓰이는 경우에는 생성하면서 프로퍼티(멤버 변수)에 바로 초기화를 할 수 있다.
//class Animal(var name: String, var age: Int){
//
//}
//
//fun main(){
//    var animal: Animal = Animal("jay", 29)
//    print(animal.name)
//    print(animal.age)
//}

// 아래의 경우에는 var나 val을 입력하지 않았기 때문에 참조변수를 이용해서 프로퍼티에 접근할 수가 없다. 애초에 프로퍼티에 할당 자체가 안 됐으니
//class Animal(name: String, age: Int){
//
//}
//
//fun main(){
//    var animal: Animal = Animal("jay", 29)
//    print(animal.name)
//    print(animal.age)
//}


// 아래처럼 보조 생성자를 만들 때 this()안에는 기본 생성자에 들어가는 매개변수들을 다 채워줘야 한다. 이 때, this가 아닌 Animal을 사용하면 컴파일 에러가 나기에 조심하자
// 106번째 줄을 보면 name에 var가 안 붙어있는데, 이유는 name을 가공하던, 그냥 냅두던 this()를 이용해서 기본생성자 초기화를 해야 하기 때문에 이 name을 적당히 가공하던지 해서
// 채워주면 알아서 기본생성자가 초기화가 되고 기본 생성자에 있는 var name: String에 의해서 알아서 이름이 프로퍼티에 할당된다.

//class Animal(var name: String, var age: Int){
//    constructor(name: String) : this(name + "ㅁ", 19)
//}
//
//fun main(){
//    var animal: Animal = Animal("jay")
//    print(animal.name)
//    print(animal.age)
//}

class A private constructor (var name: String){

}


