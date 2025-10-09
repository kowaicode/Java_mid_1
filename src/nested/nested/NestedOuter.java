package nested.nested;

public class NestedOuter {

    // 밖 클래스의 멤버들
    private static int outClassValue = 3; // static 멤버
    private int outInstanceValue = 5; // 인스턴스 멤버

    // static 중첩 클래스 생성
    static class Nested {
        private int nestedInstanceValue = 7;

        public void print() {
            // 자기 멤버는 당연히 접근 가능
            System.out.println(nestedInstanceValue);

            // 밖 클래스의 static 멤버에는 접근 가능
            System.out.println(outClassValue);

            // 밖 클래스의 인스턴스 멤버에는 접근 불가
            // System.out.println(outInstanceValue);

        }
    }
}
