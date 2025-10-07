package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        // LocalDateTime
        // LocalDate + LocalTime
        // 날짜 + 시간
        // 2020-01-01T10:30:25
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("현재 날짜 시간 = " + nowDateTime);
        LocalDateTime ofDateTime = LocalDateTime.of(2020, 1, 1, 10, 30, 25);
        System.out.println("지정 날짜 시간 = " + ofDateTime);

        // 날짜와 시간 분리
        LocalDate localDate = ofDateTime.toLocalDate();
        LocalTime localTime = ofDateTime.toLocalTime();
        System.out.println("지정 날짜 = " + localDate);
        System.out.println("지정 시간 = " + localTime);

        // 날짜와 시간 합치기
        LocalDateTime.of(localDate, localTime);
        System.out.println("날짜와 시간 합치기 = " + LocalDateTime.of(localDate, localTime));

        // 계산
        LocalDateTime ofDateTimePlus = ofDateTime.plusDays(1000);
        System.out.println("지정 날짜 시간 + 1000일 = " + ofDateTimePlus);
        LocalDateTime ofDateTimePlusYear = ofDateTime.plusYears(2);
        System.out.println("지정 날짜 시간 + 2년 = " + ofDateTimePlusYear);

        // 비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? " + nowDateTime.isBefore(ofDateTime));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? " + nowDateTime.isAfter(ofDateTime));
        System.out.println("현재 날짜시간이 지정 날짜시간과 같은가? " + nowDateTime.isEqual(ofDateTime));
        // isEqual() : 날짜와 시간 모두 같아야 true
        // equals() : 객체가 동일해야 true
    }
}
