package lang.wrapper;

public class MyInteger {
    //Wrapper 클래스: 특정 기본형을 감싸서 만든 클래스

    private final int value;
    //불변의 기본형 변수 value 생성

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value); //숫자를 문자로
    }
    //생성자, Getter, 비교, toString 메서드 제공
    //비교 메서드는 캡슐화
}
