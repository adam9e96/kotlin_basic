package `03_loop`

/**
 * todo 2024-04-09
 * when 으로 변경
 */
fun main() {/*
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
    var scores: IntArray? = null // 타입에 `?` 을 붙이면 `null`을 사용할 수 있음. <-- null safety 허용
    // NULL 허용을 하면 when 절 조건문다마 null 이 아닌 경우에만 사용 가능하도록 조건을 추가 해야 되는 문제가 발생함.
    // 빈값으로 초기화 필요함. select 1 -> 2 가 아닌 2 부터 시작 할 경우가 있기 때문.
    while (run) {
        println("-----------------------------------------------------")
        println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4. 분석 | 5.종료")
        println("-----------------------------------------------------")
        print("선택> ")
        val selectNo = readln().toInt()
        when (selectNo) {
            1 -> {
                // 작성 위치. 학생수를 입력 받아서 배열 생성
                print("학생수 >>> ")
                studentNum = readln().toInt()
                println("학생수:$studentNum") // 테스트 코드
                scores = IntArray(studentNum)
            }

            2 -> {
                // 작성 위치. 생성된 배열의 갯수 만큼 점수 입력

                // case1
                //            for (index in 0 until studentNum) { // 0 1 2
                //                print("scores[${index}]: ")
                //                var score = readln().toInt()
                //                scores[index] = score
                //            }
                // case2
                if (scores != null) { // scores가 null 이 아닐때 아래의 코드를 실행 <-- null pointer exception 방지하기 위해 나온 문법

                    for (i in scores.indices) {
                        println("scores[${i}]> ")
                        scores[i] = readln().toInt()
                    }

                }
            }

            3 -> {
                if (scores != null) {
                    // 작성 위치. 입력 받은 배열의 값을 출력
                    for (index in scores.indices) { // 0 1 2
                        println("scores[${index}]: ${scores[index]}")
                    }

                }
            }

            4 -> {
                if (scores != null) {
                    // 작성 위치. 최고 점수, 평균 점수 출력
                    // case 1.
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

                    // case2.
                    var max = scores[0]
                    var sum2 = scores[0]
                    for (i in 1 until scores.size) {
                        max = if (max < scores[i]) scores[i] else max
                        sum2 += scores[i]
                    }
                    println("최고 점수 : $max")
                    println("평균점수 : ${sum.toDouble() / scores.size}")

                }
            }

            5 -> {
                // 작성위치. run 값 변경
                run = false
            }
        }
    }
    println("프로그램 종료")
}
