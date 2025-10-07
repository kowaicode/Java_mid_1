package enumeration.ex3;

import static enumeration.ex3.Grade.*;
// import 구문을 사용하여 Grade 열거형의 상수들을 직접 참조할 수 있다.
// import 구문을 사용하지 않으면 Grade.BASIC, Grade.GOLD, Grade.DIAMOND 와 같이
// 열거형 이름을 함께 사용해야 한다.
// 실무에선 import 구문을 사용하는 경우가 많다.

public class DiscountService {

    public int discount(Grade classGrade, int price) {
        int discountPercent = 0;

        if (classGrade == BASIC) {
            discountPercent = 10;
        } else if (classGrade == GOLD) {
            discountPercent = 20;
        } else if (classGrade == DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인 X");
        }

        return (price * discountPercent) / 100;
    }
}
