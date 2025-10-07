package lang.string.method;

public class StringComparisonMain {

    public static void main(String[] args) {
        String str1 = "Hello, Java!";
        String str2 = "hello, java!";
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        //두 문자열 비교
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));
        //두 문자열 대소문자 구분없이 비교

        System.out.println("'b' compareTo 'a': " + "b".compareTo("a"));
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
        //두 문자열 사전순 비교
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2));
        //두 문자열 대소문자 구분없이 사전순 비교

        System.out.println("str1 startsWith 'Hello': " + str1.startsWith("Hello"));
        //문자열이 특정 접두사로 시작하는지??
        System.out.println("str1 endsWith 'Java!': " + str1.endsWith("Java!"));
        //문자열이 특정 접두사로 끝나는지??
    }
}
