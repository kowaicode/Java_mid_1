package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {

    public static void main(String[] args) {
        // 포맷팅: 날짜/시간 -> 문자열
        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println("date = " + date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String formattedDate = date.format(formatter);
        System.out.println("날짜, 시간 포맷팅 = " + formattedDate);

        // 파싱: 문자열 -> 날짜/시간
        String inputDate = "2024년 12월 31일";
        LocalDate parsedDate = LocalDate.parse(inputDate, formatter);
        System.out.println("날짜, 시간 파싱 = " + parsedDate);
    }
}
