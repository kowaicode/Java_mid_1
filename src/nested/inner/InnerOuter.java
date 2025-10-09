package nested.inner;

public class InnerOuter {

    private static int outClassValue = 3; // static 멤버
    private int outInstanceValue = 5; // 인스턴스 멤버

    // 내부 클래스 생성
    class Inner {
        private int innerInstanceValue = 1;

        public void print() {
            // 자기 멤버는 당연히 접근 가능
            System.out.println(innerInstanceValue);

            // 밖 클래스의 static 멤버에도 접근 가능
            System.out.println(outClassValue);

            // 밖 클래스의 인스턴스 멤버에도 접근 가능
            System.out.println(outInstanceValue);

        }
    }
}
