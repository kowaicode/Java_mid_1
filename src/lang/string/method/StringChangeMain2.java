package lang.string.method;

public class StringChangeMain2 {

    public static void main(String[] args) {
        String strWithSpaces = "    Java Programming";

        System.out.println("소문자로 변환(toLowerCase): " + strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환(toUpperCase): " + strWithSpaces.toUpperCase());

        System.out.println("문자열 내 공백제거(trim): " + strWithSpaces.trim());

        System.out.println("문자열 내 공백제거(strip): " + strWithSpaces.strip());
        System.out.println("문자열 내 앞공백제거(strip): " + strWithSpaces.stripLeading());
        System.out.println("문자열 내 뒷공백제거(strip): " + strWithSpaces.stripTrailing());
        //strip 기능이 좀 더 좋음
    }
}
