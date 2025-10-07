package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";

        String result1 = a.concat(b);
        String result2 = a + b; //String은 +연산 하게 해줌(하도 많이 써서)

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
