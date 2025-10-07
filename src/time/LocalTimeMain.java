package time;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now(); // 현재 시간
        System.out.println("현재 시간 = " + nowTime);
        LocalTime ofTime = LocalTime.of(10, 30, 25); // 10시 30분 25초
        System.out.println("지정 시간 = " + ofTime);

        // 계산 (이거 안됨)
        ofTime.plusSeconds(20);
        System.out.println("지정 시간 + 20초 = " + ofTime);
        // 시간은 불변 객체임 -> 변경된 시간을 새로 만들어서 반환
        ofTime = ofTime.plusSeconds(20);
        System.out.println("지정 시간 + 20초 = " + ofTime);
    }
}
