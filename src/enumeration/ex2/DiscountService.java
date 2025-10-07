package enumeration.ex2;

public class DiscountService {

    // 매개변수의 타입을 ClassGrade 로 제한
    public int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

        if (classGrade == ClassGrade.BASIC) {
            discountPercent = 10;
        } else if (classGrade == ClassGrade.GOLD) {
            discountPercent = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인 X");
        }
        // String 과 달리 == 연산자로 비교 가능
        // 동일한 인스턴스인지 비교하기 때문
        // 즉, 타입 안전성이 보장된다.
        // 또한, 컴파일 시점에 오류를 잡아낼 수 있다.
        // 그러나 이 방식 또한 문제가 있다.
        // ClassGrade 타입이기 때문에
        // 다른 클래스의 인스턴스는 올 수 없지만
        // null 값은 올 수 있다.
        return (price * discountPercent) / 100;
    }
}
