package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 12, 31);

        Period between = Period.between(startDate, endDate);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("startDate = " + startDate);
        System.out.println("endDate = " + endDate);
        System.out.println("남은 기간: " + between.getYears() + "년 " + between.getMonths() + "개월");
        System.out.println("D-DAY: " + daysBetween + "일");
    }
}
