package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        //사실 String은 참조형이기 때문에 객체를 만들어야하지만 너무 많이써서 자바가 걍 허용해주는것임
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
