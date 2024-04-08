package `03_loop`

fun main() {
    /*
     * 	/* 키보드로 부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다.
        실행결과를 보고 알맞게 작성해 보세요.

        실행 예)
        -----------------------------------------------------
        1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        -----------------------------------------------------
        선택> 1
        학생수> 3
        [0, 0, 0]
        -----------------------------------------------------
        1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        -----------------------------------------------------
        선택> 2
        scores[0]> 90
        scores[1]> 80
        scores[2]> 70
        -----------------------------------------------------
        1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        -----------------------------------------------------
        선택> 3
        scores[0]: 90
        scores[1]: 80
        scores[2]: 70
        -----------------------------------------------------
        1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        -----------------------------------------------------
        선택> 4
        최고 점수: 90
        평균 점수: 80.0
        -----------------------------------------------------
        1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        -----------------------------------------------------
        선택> 5
        프로그램 종료

         */
     */
    var run = true // 반복문의 조건으로 사용 -> 값이 false 가 된다면 반복문이 종료
    var studentNum: Int = 0 // 학생수
    var scores: IntArray = intArrayOf()// 점수를 입력 받을 빈 배열을 생성. 사용자에게 입력받은 학생수를 기준으로 배열 생성.
    while (run) {
        println("-----------------------------------------------------")
        println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4. 분석 | 5.종료")
        println("-----------------------------------------------------")
        print("선택> ")
        val selectNo = readln().toInt()
        if (selectNo == 1) {
            // 작성 위치. 학생수를 입력 받아서 배열 생성
            print("학생수를 입력하세요 >>> ")
            studentNum = readln().toInt()
            println("학생수:$studentNum") // 테스트 코드
//            println(scores.toString())
//            print("[")
//            for (score in scores) {
//                print("$score ")
//            }
//            println("]")

        } else if (selectNo == 2) {
            scores = IntArray(studentNum)
            // 작성 위치. 생성된 배열의 갯수 만큼 점수 입력
            for (index in 0 until studentNum) { // 0 1 2
                print("scores[${index}]: ")
                var score = readln().toInt()
                scores[index] = score
            }

        } else if (selectNo == 3) {
            // 작성 위치. 입력 받은 배열의 값을 출력
//            scores[0]: 90
//            scores[1]: 80
//            scores[2]: 70
//            for (index in scores){
//                println("scores[${intArrayOf(index)}: ${scores[index]}")
//            }
            for (index in 0 until studentNum) { // 0 1 2
                println("scores[${index}]: ${scores[index]}")
//      scores[0]: 90
            }

        } else if (selectNo == 4) {
            // 작성 위치. 최고 점수, 평균 점수 출력
            var maxScore = 0
            var avgScroe = 0
            var sum = 0
            for (index in 0 until studentNum) {
                if (maxScore < scores[index]) {
                    maxScore = scores[index]
                }
                sum += scores[index]
            }
            avgScroe = (sum / scores.size)
//            최고 점수: 90
//            평균 점수: 80.0

            println("최고 점수: ${maxScore}")
            println("평균 점수: ${avgScroe}")

        } else if (selectNo == 5) {
            // 작성위치. run 값 변경
            run = false
        }
    }
    println("프로그램 종료")
}
