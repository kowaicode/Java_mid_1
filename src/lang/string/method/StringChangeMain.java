package lang.string.method;

public class StringChangeMain {

    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java";

        System.out.println("Index 7 부터 부분 문자열(substring): " + str.substring(7));
        System.out.println("Index 7~12의 부분 문자열(substring): " + str.substring(7, 12));

        System.out.println("문자열 결합(concat): " + str.concat("!!!"));
        System.out.println("Java를 World로 대체(replace): " + str.replace("Java", "World"));
        System.out.println("첫 Java를 World로 대체(replaceFirst): " + str.replaceFirst("Java", "World"));
    }
}
