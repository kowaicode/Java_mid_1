package enumeration.ex1;

public class StringGradeEx0_1 {

    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();

        int price = 10000;

        // 문자열 상수를 사용
        // 이런식이면 오타가 날 때 상수로 잡아내기 때문에 컴파일 에러가 난다.
        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("BASIC 할인 금액: " + basic);
        System.out.println("GOLD 할인 금액: " + gold);
        System.out.println("DIAMOND 할인 금액: " + diamond);
    }
}
