package enumeration.ex1;

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

        // 해당 패키지는 상수로 문자열을 사용하여 등급을 관리한다.
        // 그러나 메서드는 매개변수로 String 타입을 받기 때문에
        // 상수를 쓰지 않아도 정상적으로 컴파일된다.
        // 즉, 개발자가 주석을 보고 상수를 사용해야 한다는 것을 인지하지 못하면
        // ex0과 동일한 문제가 발생할 수 있다.
    }
}
