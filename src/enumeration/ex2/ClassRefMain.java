package enumeration.ex2;

public class ClassRefMain {

    public static void main(String[] args) {
        // getClass() 메서드로 클래스 정보를 얻어올 수 있다.
        System.out.println("class BASIC: " + ClassGrade.BASIC.getClass());
        System.out.println("class GOLD: " + ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND: " + ClassGrade.DIAMOND.getClass());

        // 각 상수의 참조값(레퍼런스)을 출력
        // 동일한 클래스의 인스턴스이므로 참조값은 다르다.
        System.out.println("ref BASIC: " + ClassGrade.BASIC);
        System.out.println("ref GOLD: " + ClassGrade.GOLD);
        System.out.println("ref DIAMOND: " + ClassGrade.DIAMOND);
    }
}
