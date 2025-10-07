package lang.string.method;

public class StringSearchMain {

    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java world.";

        System.out.println("문자열에 'Java' 포함?: " + str.contains("Java"));
        System.out.println("문자열 맨 앞에서 시작하여 마주치는 'Java'에서의 첫번째 문자(J)의 Index: " + str.indexOf("Java"));
        System.out.println("Index 10부터 시작하여 마주치는 'Java'의 Index: " + str.indexOf("Java", 10));
        System.out.println("문자열 맨 뒤에서 시작하여 마주치는 'Java'에서의 마지막 문자(a) Index: " + str.lastIndexOf("Java"));
    }
}
