package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {
        //불변 클래스를 불러옴
        ImmutableAddress a = new ImmutableAddress("대전");
        ImmutableAddress b = a;
        //불변 클래스 불러와도 참조값 대입은 못 막음
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b.setValue("부산"); 사이드이펙트 원천차단..왜? setter가 없으므로
        b = new ImmutableAddress("부산");
        System.out.println("주소값 변경: 부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
