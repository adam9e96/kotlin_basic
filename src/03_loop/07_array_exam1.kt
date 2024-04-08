package `03_loop`

fun main() {
    /*
     * for 문을 이용해서 arr 배열의 합을 구하세요
     */


    val arr = intArrayOf(10, 20, 30, 40, 50)
    var sum = 0
// case 1. until 사용 (수정됨)
    for (i in 0 until arr.size) {
        sum += arr[i]
    }
    println("총합은 $sum") // 정확한 총합 출력을 위해 이 위치에 println을 두면 안 됩니다.


    // case 2
    for (element in arr) {
        sum += element
    }
    println("총합은 $sum") // 150

    // 3. indices 사용
    println(arr.indices) // 0..4
    sum = 0
    for (i in arr.indices) {
        sum += arr[i]
    }
    println("sum = $sum") // 150
}