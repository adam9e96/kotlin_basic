package ch11_

/**
 * fileName       : `02`
 * date           : 2024-04-24
 * time           : 오후 2:23
 * ===========================================================
 * description    :
 */
/*
    2. lazy
    lazy 는 읽기 전용 변수인 val 을 사용하는 지연 초기화.
    lateinit 이 입력된 값을 변경할 수 있는 반면, lazy는 입력된 값을 변경할 수 없음. 그리고 사용법도 다름.

    val 로 변수를 먼저 선언한 후 코드의 뒤쪽에 by lazy 키워드를 사용하면 됨.
    그리고 by lazy 다음에 나오는 중괄호{} 에 초기화 할 값을 써주면 됨.
 */
class Company {
    // by lazy 를 사용하면 반환되는 값의 타입을 추론할 수 있기 때문에 변수의 타입을 생략할 수 있음.
    val person: Person by lazy { Person()}
    init {
        // lazy 는 선언 시에 초기화 코드를 함께 작성 하기 떄문에 초기화 과정이 필요 없음.
    }
    fun process() {
        println("person의 이름은 ${person.name}") // 최초 호출되는 시점에 초기화
    }
}
/*
    lazy 의 특징
    1. 선언 시에 초기화 코드를 함께 작성하기 때문에, 따로 초기화 할 필요가 없음.
    2. lazy로 선언된 변수가 최초 호출되는 시점에 by lazy{} 안에 넣은 값으로 초기화.
           코드에서 Company 클래스가 초기화 되더라도 person에 바로 Person() 으로 초기화 되지 않고,
           process() 메서드에서 person.name 이 호출되는 순간 초기화.

   lazy는 주의해서 사용. 지연 초기화는 말 그대로 초초 호출되는 시점에 초기화 작업이 일어나기 떄문에.
   초기화하는데 사용되는 리소스가 너무 크면
   (메모리를 많이 쓰거나 코드가 복잡한 경우) 전체 처리 속도에 나쁜 영향을 미칠 수 있음.

   예를 들어 Company 클래스에서 처리하는 Person 클래스의 코드가 복잡하면 단순히 person.name을 호출하는 데 수 초가 걸릴 수도 있음.
   따라서 복잡한 코드를 가지고 있는 클래스라면 미리 초기화해 놓고 사용하는 것이 좋음.

 */
fun main() {
    val company = Company()
    company.process()
}