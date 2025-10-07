package enumeration.ex3;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC: " + Grade.BASIC.getClass());
        System.out.println("class GOLD: " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND: " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC: " + Grade.BASIC);
        System.out.println("ref GOLD: " + Grade.GOLD);
        System.out.println("ref DIAMOND: " + Grade.DIAMOND);

        System.out.println("real ref BASIC: " + refValue(Grade.BASIC));
        System.out.println("real ref GOLD: " + refValue(Grade.GOLD));
        System.out.println("real ref DIAMOND: " + refValue(Grade.DIAMOND));
    }

    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}

// enum은 toString() 메서드가 이미 오버라이딩 되어 있다.
// 따라서, 참조값(레퍼런스)도 동일하다.
// 예를 들어, Grade.BASIC.toString()은 "BASIC"을 반환한다.
// 진짜 참조값을 보려면 System.identityHashCode() 메서드를 사용해야 한다.
// System.identityHashCode() 메서드는 객체의 실제 참조값을 숫자로 반환한다.
// toHexString() 메서드는 10진수를 16진수 문자열로 변환한다.
// 우리가 일반적으로 보는 참조값(레퍼런스)은 16진수.
