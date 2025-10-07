package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now(); // 현재 날짜
        System.out.println("오늘 날짜 = " + nowDate);
        LocalDate ofDate = LocalDate.of(2020, 1, 1); // 2020년 1월 1일
        System.out.println("지정 날짜 = " + ofDate);

        // 계산 (이거 안됨)
        ofDate.plusDays(20);
        System.out.println("지정 날짜 + 20일 = " + ofDate);
        // 날짜는 불변 객체임 -> 변경된 날짜를 새로 만들어서 반환
        ofDate = ofDate.plusDays(20);
        System.out.println("지정 날짜 + 20일 = " + ofDate);
    }
}
