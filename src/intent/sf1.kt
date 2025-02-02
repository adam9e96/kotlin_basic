package intent

import java.io.FileOutputStream
import java.io.OutputStreamWriter
import java.nio.charset.StandardCharsets


fun main() {
    val text = """
        물리학자 윤진은 우주의 비밀을 밝히기 위해 평생을 바쳤다. 그는 아인슈타인의 상대성 이론과 양자 역학을 통합하는 이론을 발견하고자 했다. 그가 개발한 초고속 입자 가속기는 빛의 속도를 초과하는 입자를 만들어내는 데 성공했다.

        그러던 어느 날, 윤진은 실험 도중 이상한 신호를 감지했다. 신호는 일련의 복잡한 숫자와 기호로 이루어져 있었으며, 그것은 마치 외계의 언어처럼 보였다. 그는 그 신호를 해독하기 위해 밤낮으로 연구에 몰두했다.

        몇 달의 고된 연구 끝에, 그는 그 신호가 실제로 외계 생명체로부터 온 메시지임을 알아냈다. 메시지는 "우리는 당신의 시간선에서 벗어난 존재입니다. 당신의 과거와 미래에서 온 우리의 인사를 받으세요."라는 내용이었다.

        윤진은 충격을 받았지만, 동시에 엄청난 호기심에 사로잡혔다. 그는 외계 생명체와의 통신을 시도하기 위해 더 많은 실험을 진행했다. 그러던 중, 그는 실험 장치의 오작동으로 인해 시공간의 틈새로 빨려 들어가고 말았다.

        눈을 떠보니 그는 낯선 행성에 도착해 있었다. 그곳은 지구와 비슷하지만, 기술과 문명이 훨씬 발달해 있었다. 그를 맞이한 것은 인간과 닮은 외계인들이었고, 그들은 윤진에게 자신의 세계를 안내해 주었다.

        외계인들은 시공간을 자유롭게 이동할 수 있는 능력을 가지고 있었고, 그들은 이를 통해 여러 우주와 차원을 탐험하고 있었다. 윤진은 그들과 함께 여행하며 우주의 다양한 비밀을 배워나갔다. 그는 지구로 돌아가기 위해 노력했지만, 동시에 이 새로운 지식을 통해 인류에게 더 큰 기회를 제공할 방법을 고민했다.

        윤진은 결국 지구로 돌아오는 방법을 찾았고, 그는 이 모든 경험을 바탕으로 인류에게 새로운 과학적 도약을 선사했다. 그의 발견은 인류가 우주를 탐험하고, 새로운 문명을 만날 수 있는 길을 열어주었다.
    """.trimIndent()

    // UTF-8 인코딩으로 파일 쓰기
    val fileOutputStream = FileOutputStream("시공간 탐험가.txt")
    val outputStreamWriter = OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8)

    outputStreamWriter.use { writer ->
        writer.write(text)
    }

//    fileOutputStream.close()
//    outputStreamWriter.close() // outputStreamWriter.use 블록내에서 자동으로 닫히기 때문에 필요 없음
    println("파일이 UTF-8 인코딩으로 저장되었습니다.")
}