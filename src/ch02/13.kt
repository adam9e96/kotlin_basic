package ch02

fun main() {


    for (i in 1..4) {
        for (j in 1..4) {
            // 1 2 3 4
            if (j <= i) {
                print("*")
            }
        }
        println()
    }
}