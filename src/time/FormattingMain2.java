package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {

    public static void main(String[] args) {
        // 포맷팅: 날짜/시간 -> 문자열
        LocalDateTime now = LocalDateTime.of(2024, 12, 31, 13, 30, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("날짜, 시간 포맷팅 = " + formattedDateTime);

        // 파싱: 문자열 -> 날짜/시간
        String inputDateTime = "2056년 12월 31일 13:30:59";
        LocalDateTime parsedDateTime = LocalDateTime.parse(inputDateTime, formatter);
        System.out.println("날짜, 시간 파싱 = " + parsedDateTime);
    }
}
