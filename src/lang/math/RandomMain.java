package lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        Random random = new Random();
        //Random random = new Random(1);
        //인스턴스 내부 seed가 같으면 실행해도 랜덤 결과가 똑같음

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);
        
        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);
        
        //범위 조회
        int randomRange1 = random.nextInt(10); //0~9까지 랜덤
        System.out.println("0 ~ 9 중 랜덤 = " + randomRange1);
        int randomRange2 = random.nextInt(10) + 1; //1~10까지 랜덤
        System.out.println("1 ~ 10 중 랜덤 = " + randomRange2);
    }
}
