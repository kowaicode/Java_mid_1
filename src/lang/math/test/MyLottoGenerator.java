package lang.math.test;

import java.util.Random;

public class MyLottoGenerator {

    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[6];

        System.out.print("로또 번호: ");

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    i--;
                    break;
                }
            }
            System.out.print(num[i] + " ");
        }
    }

}
