package nested.nested;

public class NestedOuterMain {
    
    public static void main(String[] args) {
        // NestedOuter 안의 static 중첩 클래스 객체 생성
        // new 바깥 클래스.중첩클래스();
        NestedOuter.Nested nested = new NestedOuter.Nested();
        // 위의 두 클래스는 아무런 관계가 없다.

        // 중첩 클래스의 print 메서드 호출
        nested.print();

        // 중첩 클래스의 타입 확인
        System.out.println("nestedClass = " + nested.getClass());
        // 출력: nestedClass = class nested.nested.NestedOuter$Nested
        // 중첩 클래스의 이름은 NestedOuter$Nested와 같이
        // 바깥 클래스 이름 뒤에 $기호와 중첩 클래스 이름이 붙은 형태이다.
    }
}
