package `02`
fun main(args: Array<String>): Unit {
    val result5 = 20

    when {
        result5 > 50 -> println('A')
        result5 > 40 -> println('B')
        result5 > 30 -> println('C')
        result5 > 20 -> println('D')
        else -> println('E') // 결과: E
    }
}
