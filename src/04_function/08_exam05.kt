package `04_function`

/**
 * fileName       : `08_exam05`
 * date           : 2024-04-09
 * time           : 오후 4:40
 * ===========================================================
 * description    :
 *
 * while문과 readln를 이용해서 키보드로 입력된 데이터로 계좌생성, 계좌목록, 예금, 출금,  조회, 종료 기능을 제공하는 코드를 완성하세요.
 *     1) main 함수의 계좌생성, 계좌목록, 예금, 출금, 조회, 종료의 동작 구분은 when 으로 작성.
 *     모든 코드의 for문은 idx를 사용할 것.
 */
fun main() {

    val max = 3
    val anos = Array<String>(max, { "" }) // 통장번호
    val owners = Array<String>(max, { "" }) // 예금주
    val balances = IntArray(max) // 잔액
    var idx = 0 // 생성된 계좌수
    var run = true

    anos[0] = "123"
    anos[1] = "234"
    anos[2] = "345"

    owners[0] = "홍길동"
    owners[1] = "박수동"
    owners[2] = "김길수"

    balances[0] = 1000
    balances[1] = 2000
    balances[2] = 3000
    idx = 3


    while (run) {
        println("----------------------------------------------------------")
        println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료")
        println("----------------------------------------------------------")
        print("선택> ")

        val selectNo: Int = readln().trim().toInt()
        when (selectNo) {
            1 -> idx = createAccount(anos, owners, balances, idx, max)
            2 -> viewAccountList(anos, owners, balances, idx)
            3 -> deposit(anos, owners, balances, idx)
            4 -> withdraw(anos, owners, balances, idx)
            5 -> viewAccount(anos, owners, balances, idx)
            6 -> run = false
        }
//        println("=====")
//        println("계좌 생성 테스트")
//        for (i in 0 until idx) {
//            println("$i 번 계좌")
//            println(anos[i])
//            println(owners[i])
//            println(balances[i])
//        }
//        println("=====")
    }
    println("프로그램 종료")
}


fun createAccount(anos: Array<String>, owners: Array<String>, balances: IntArray, idx: Int, max: Int): Int {
    println("계좌수 테스트 : $idx")
    if (idx == max) {
        println("생성 가능한 계좌의 범위를 초과했습니다.")
        return idx
    }
    println("--------------")
    println("계좌생성")
    println("--------------")
    print("계좌번호: ")
    anos[idx] = readln().trim()

    print("계좌주: ")
    owners[idx] = readln().trim()

    print("초기입금액: ")
    balances[idx] = readln().trim().toInt()

    println("계좌가 생성되었습니다.")
    return idx + 1
}

fun viewAccountList(anos: Array<String>, owners: Array<String>, balances: IntArray, idx: Int) {
    for (i in 0 until idx) {
        println("${anos[i]} ${owners[i]} ${balances[i]}")
    }
}

fun deposit(anos: Array<String>, owners: Array<String>, balances: IntArray, idx: Int) {
    println("--------------")
    println("예금")
    println("--------------")
    print("계좌번호: ")
    val ano: String = readln().trim()
    print("예금액: ")
    val money: Int = readln().trim().toInt()

    var isFound = false
    if (money <= 0) {
        println("0원 이상만 입금가능합니다.")
        return
    }

    for (i in 0 until idx) {
        if (ano.equals(anos[i])) {
            println("결과: 예금이 성공되었습니다.")
            balances[i] = balances[i] + money
            isFound = true
            break
        }
    }
    if (!isFound) {
        println("계좌를 잘못입력하였습니다.")
    }

}

fun withdraw(anos: Array<String>, owners: Array<String>, balances: IntArray, idx: Int) {
    println("--------------")
    println("출금")
    println("--------------")
    print("계좌번호: ")
    val ano: String = readln().trim()
    print("출금액: ")
    val money: Int = readln().trim().toInt()

    var isFound = false
    if (money <= 0) {
        println("0원 이상만 출금가능합니다.")
        return
    }

    for (i in 0 until idx) {
        if (ano.equals(anos[i])) {
            if (balances[i] > money) {
                balances[i] = balances[i] - money
                println("결과 : 출금이 성공되었습니다.")
                isFound = true
                break
            } else {
                println("결과 : 잔액보다 출금액이 커서 출금에 실패했습니다.")
            }
        }
    }
    if (!isFound) {
        println("계좌를 잘못입력하였습니다.")
    }


}

fun viewAccount(anos: Array<String>, owners: Array<String>, balances: IntArray, idx: Int) {
    println("--------------");
    println("조회");
    println("--------------");
    print("계좌번호: ")
    val ano: String = readln().trim()
//    findAccount(ano,anos,idx,owners,balances)
    var isFound = false
    for (i in 0 until idx) {
        if (ano.equals(anos[i])) {
            println("${anos[i]} ${owners[i]} ${balances[i]}")
            isFound = true
            break
        }
    }
    if (!isFound) {
        println("계좌가 없습니다.")
    }

}

//fun findAccount(ano:String, anos: Array<String>, idx:Int, owners: Array<String>, balances: IntArray):Boolean{
//    for (i in 0 until idx) {
//        if (ano.equals(anos[i])) {
//            println("${anos[i]} ${owners[i]} ${balances[i]}")
//            return true
//        }
//    }
//    return false
//}