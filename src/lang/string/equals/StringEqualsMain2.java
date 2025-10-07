package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("인스턴스 + 메서드 호출 비교: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 + 메서드 호출 비교: " + isSame(str3, str4));
    }

    private static boolean isSame(String x, String y) {
        //메서드 호출하여 비교 시 매개변수로 넘어오는 String x,y는
        //String이긴 하나 이 String이 new로 온건지 리터럴로 온건지 모름(걍 타입만 받으니까)
        //근데 x == y 이래버리면 인스턴스의 경우 false, 리터럴의 경우 true임
        //그래서 return x == y; 가 아니라
        return x.equals(y); //항상 equals(); 사용
    }
}
