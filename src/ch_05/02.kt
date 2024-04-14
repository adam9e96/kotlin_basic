package ch_05

/**
 * fileName       : `02`
 * date           : 2024-04-12
 * time           : 오후 2:44
 * ===========================================================
 * description    :
 */

fun main() {
    /**
     * 문자열을 저장할 수 있는 List 객체를 생성하고 여기에 "a","b","c","d","e" 를 저장한 후
     * 이것을 출력하는 프로그램을 작성
     * 출력 예:
     * [a,b,c,d,e]
     */
    // immutable 
    val immutableString = listOf("a", "b", "c", "d", "e")
    println(immutableString)

    // mutable
    val mutableStirng = mutableListOf<String>()
    println(mutableStirng)


    mutableStirng.add("a")
    mutableStirng.add("b")
    mutableStirng.add("c")
    mutableStirng.add("d")
    mutableStirng.add("e")
    println(mutableStirng)
    for (item in mutableStirng) {
        println(item)
    }

}