package enumeration.ex0;

public class StringGradeEx0_2 {

    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();

        int price = 10000;

        // int basic = discountService.discount("BASIC", price);
        // int gold = discountService.discount("GOLD", price);
        // int diamond = discountService.discount("DIAMOND", price);

        // System.out.println("BASIC 할인 금액: " + basic);
        // System.out.println("GOLD 할인 금액: " + gold);
        // System.out.println("DIAMOND 할인 금액: " + diamond);

        // 존재하지 않는 등급 입력하면?
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 할인 금액: " + vip);

        // 오타가 있는 등급 입력하면?
        int diamonf = discountService.discount("DIAMONF", price);
        System.out.println("DIAMONF 할인 금액: " + diamonf);

        // 소문자 입력하면?
        int gold = discountService.discount("gold", price);
        System.out.println("gold 할인 금액: " + gold);

        // 이와 같이 String 으로 등급을 관리하면
        // 존재하지 않는 등급, 오타, 대소문자 구분 문제 등으로 인해
        // 할인 정책이 의도치 않게 동작할 수 있다.
        // 즉, 타입 안전성이 보장되지 않는다.

        // 또한, 컴파일 시점에 오류를 잡아낼 수 없다.
        // 런타임 시점에야 오류를 발견할 수 있다.
        // 이 문제를 해결하려면 특정 범위로 타입을 제한해야 한다.
        // 이를 위해 열거 타입(enumeration type, enum)을 사용한다.
    }
}
