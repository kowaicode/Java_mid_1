package lang.immutable.address;

public class ImmutableAddress {
    //불변 객체를 만들어보자
    //객체의 상태(객체 내부 값, 필드, 멤버변수 등)가 변하지 않는 객체
    private final String value;

    //내부 값이 변경되면 안되므로 final로 선언
    //없어도 무방하긴 함
    public ImmutableAddress(String value) {
        this.value = value;
    }

    //생성자로 값을 설정 But 값 변경 불가
    public String getValue() {
        return value;
    }

    //getter만 넣음(setter는 값을 저장할 수 있으므로)
    //특히 setter는 절대로 넣으면 안됨
    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
