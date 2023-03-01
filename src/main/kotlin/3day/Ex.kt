package `3day`

class Ex {
}

//open class Animals(var name: String, var age: Int, var type: String)
//
//class Dog(name: String, age: Int): Animals(name, age, "개"){
//    fun bark(){
//        println("bwww")
//    }
//}
//
//
//
//class Cat(name: String, age: Int): Animals(name, age, "고양이"){
//    fun meow(){
//        println("mwww")
//    }
//}
//
//
//fun main(){
//    var dogman = Dog("yalloo", 29)
//    var catman = Cat("dodo", 7)
//
//    println("${dogman.name}, ${dogman.age}, ${dogman.type}")
//    println("${catman.name}, ${catman.age}, ${catman.type}")
//    dogman.bark()
//    catman.meow()
//
//
//}

/* kotlin 기본 프로젝트 구조 -> Java와의 차이점
   패키지 명과 폴더 명을 일치시키지 않아도
   Java는 패키지 폴더구조를 가지고 있어야
   Kotlin은 패키지에만 잘 담으면 폴더 이름이 패키지 명과 달라도 쓸 수 있음
   패키지 내에서는 변수 등이 공유됨 -> 다른 패키지인 경우 import를 사
   그리고 클래스명과 파일명이 달라도 됨 -> 컴파일러가 알아서 처리
   하나의 파일에 여러 클래스를 넣고 Public class를 지정하지 않아도 되는

   정리: 파일 내에 있는 Package를 기준으로 구분함
 */

open class Animals(var name: String, var age: Int, var type: String){

    open fun introduce(){
        println("내 이름은 ${this.name}이고, 나이는 ${this.age} 종은 ${this.type}이야")
    }
}

