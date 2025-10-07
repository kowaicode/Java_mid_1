package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        //인스턴스를 만드는 경우
        String str1 = new String("hello");
        String str2 = new String("hello");
        //str1, 2는 각자 새로 만들어진 객체라 주소값(참조)이 서로 다름 But 문자열 내용은 동일
        System.out.println("new String() == 비교[동일성]: " + (str1 == str2)); //주소값을 비교하는 것이므로 False
        System.out.println("new String() equals 비교[동등성]: " + (str1.equals(str2))); //내용이 같은지를 물어보는 것이므로 True

        //리터럴로 가는 경우
        String str3 = "hello";
        String str4 = "hello";
        //이 또한 위와 같음(String은 하도 많이 써서 Java가 걍 이대로 써도 용인해줌)
        System.out.println("리터럴 == 비교[동일성]: " + (str3 == str4)); //False이지만 True....
        System.out.println("리터럴 equals 비교[동등성]: " + (str3.equals(str4))); //True
        //리터럴의 동일성이 True인 이유
        //리터럴로 가면 자바는 메모리 효율을 위해 문자열 풀(Pool)을 사용
        //리터럴이 있으면 그 풀에 String 인스턴스를 미리 만들지만 같은 문자열 있으면 안만듦
        //즉, str3에서 hello로 리터럴을 했기 때문에 str4를 만들어도 이미 같은 문자열이기 때문에 풀에서 str3의 참조를 꺼냄
        //그래서 동일성이 True로 나오는 것임

    }
}
