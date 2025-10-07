package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        LocalTime lt = LocalTime.of(1, 0);
        System.out.println("lt = " + lt);

        LocalTime plusTime = lt.plus(duration);
        System.out.println("plusTime = " + plusTime);

        LocalTime startTime = LocalTime.of(10, 0);
        LocalTime endTime = LocalTime.of(12, 30);
        Duration between = Duration.between(startTime, endTime);
        System.out.println("between = " + between.getSeconds() + "초");
        System.out.println("working time = " + between.toHours() + "시간 " + between.toMinutesPart() + "분");
    }
}
