package lang.string.test;

public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello Java";
        
        //내 해답
        StringBuilder sb = new StringBuilder();
        sb.append(str).reverse();
        System.out.println(sb);

        //원래 해답
        String sb1 = new StringBuilder(str).reverse().toString();
        System.out.println(sb1);
    }
}
