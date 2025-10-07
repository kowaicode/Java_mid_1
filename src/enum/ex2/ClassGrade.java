package enumeration.ex2;

public class ClassGrade {
    // 이번엔 직접 열거형 패턴을 구현해보자
    // 회원 등급을 나타내는 클래스
    // 각각의 상수마다 인스턴스를 하나씩 생성
    public static final ClassGrade BASIC = new ClassGrade(); //x001
    public static final ClassGrade GOLD = new ClassGrade(); //x002
    public static final ClassGrade DIAMOND = new ClassGrade(); //x003

    // private 생성자 (외부에서 인스턴스 생성 불가)
    private ClassGrade() {}

    // 이 방식의 단점은
    // 많은 수의 상수를 정의해야 할 때
    // 일일이 인스턴스를 생성해야 한다는 점이다.
    // 또한, 인스턴스에 값을 추가하려면 생성자에 매개변수를 추가해야 하는데
    // 이 경우 기존에 생성된 인스턴스들을 모두 수정해야 한다.
    // 즉, 유지보수가 어렵다.
    // 이러한 문제를 해결하기 위해
    // 자바는 enum 키워드를 제공한다.
}
