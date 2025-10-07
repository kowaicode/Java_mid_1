package lang.string.method;

public class StringUtilsMain2 {

    public static void main(String[] args) {
        int num = 100;
        boolean flag = true;
        String str = "Hello, Java!";

        //format 메서드
        String format1 = String.format("num: %d, flag: %b, str: %s", num, flag, str);
        System.out.println(format1);

        String format2 = String.format("숫자: %.2f", 10.2222);
        System.out.println(format2);

        //printf
        System.out.printf("숫자: %.2f\n", 10.1222);

        //matches 메서드
        String regex = "Hello, (Java!|World)";
        System.out.println("'str'과 패턴 일치??: " + str.matches(regex));
    }
}
