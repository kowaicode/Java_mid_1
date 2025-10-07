package lang.wrapper;

public class WrapperVsPrimitive {

    public static void main(String[] args) {
        int iterations = 1_000_000_000; //자릿수 표시는 _로 가능
        long startTime, endTime; //시작 시간, 종료 시간

        //기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("기본형 10억번 더하기: " + sumPrimitive);
        System.out.println("실행 시간: " + (endTime - startTime) + "ms");

        //래퍼 Long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i; //오토박싱 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println("래퍼형 10억번 더하기: " + sumWrapper);
        System.out.println("실행 시간: " + (endTime - startTime) + "ms");
        
        //기본형이 더 계산속도 빠름...왜?
        //기본형은 그냥 값만 주어지기 때문에 주어지는대로 연산만 하고 끝나버림
        //반면 래퍼형은 인스턴스고 그 안의 기능을 다루기 위한것들이 들어가있기 때문에 좀 더 걸림
        //근데...사실 실제 애플리케이션을 만드는 관점에서는 이 속도를 재는건 의미 ㅈ도 없음
        //굉장하고 엄청나게 특수한 경우 아니면 걍 유지보수하기 편한거 쓰자
        //유지보수와 최적화를 고려한다면 유지보수가 좋은 쪽을 고르는게 낫다
    }
}
