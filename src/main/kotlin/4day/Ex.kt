// 변수 이.타.값(이름, 타입, 값)
var name1: String = "hi"

// 상수 이.타.값
val name2: String = "hi2"

// 자료형(추론O)
var str1 = "hi";

// 자료형(추론X)
var str2: String = "hi";

// 함수
fun info(name: String, age: Int) {
    print("이름은 " + name + "이고 나이는 " + age + "살입니다.")
}

class User(name: String, age: Int) {

    var name: String = name;
    var age: Int = age;

    fun myInfo() {
        println(name);
        println(age);
    }
}

fun compare(age1: Int, age2: Int) {
    if (age1 >= age2) {
        print("${age1}가 ${age2}보다 더 크다.")
    } else {
        print("${age1}보다 ${age2}가 더 크다.")
    }
}


var str3: String = "hi"
var str4: String? = null

fun sendMail(mail: String) {
    println(mail)
}


//// 변수명?.(안전 호출 연산자 ?.)를 통해 null체크와 메서드 수행을 한 번에 처리
//fun main() {
//    str3?.let { sendMail("메일 전송") } //str3이 null이 아니면 let 블럭의 메서드 수행O
//    str4?.let { sendMail("메일 전송") } //str4가 null이기 때문에 let 블럭의 메서드 수행x
//}

//// 변수명.?~~~ ?:(엘비스 연산자 ?:) n
//fun main() {
//    var ex: String? = null;
//
//    var result: Int =  ex?.length ?: -1
//    println(result)
//
//}


//// String 클래스에 확장 함수 추가
//fun String.lastChar(): Char = this[length - 1]
//
//fun main() {
//    val str = "Hello World!"
//    val lastChar = str.lastChar()
//    println(lastChar)
//}

//
//fun String.lastChar(): Char = this[length - 1]
//
//fun main() {
//    var c = "hi";
//    var last = c.lastChar();
//    print(last)
//}


// 람다식

var list = listOf<String>("hi", "im", "jay", "nice", "to", "meet", "you", "!")
var newList = list.filter { it.startsWith("") }

fun main() {
    for (s in newList) {
        println(s)
    }
}









