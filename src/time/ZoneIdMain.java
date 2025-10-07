package time;

import java.time.ZoneId;

public class ZoneIdMain {

    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " : " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("현재 시스템의 기본 시간대 = " + zoneId);
    }

}

// ZoneId : 시간대
// of(String zoneId) : 지정된 zoneId의 ZoneId 객체 반환
// getAvailableZoneIds() : 사용 가능한 모든 zoneId 문자열 Set<String> 반환
// getRules() : ZoneRules 객체 반환
// systemDefault() : 시스템의 기본 시간대 ZoneId 객체 반환
