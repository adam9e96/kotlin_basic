package ch_03_loop


fun main() {
    while (true) {

        val num1 = (1..6).random()
        val num2 = (1..6).random()
        println(" (${num1} , ${num2})")
        if (num1 + num2 == 5) {
            break
        }
    }
}