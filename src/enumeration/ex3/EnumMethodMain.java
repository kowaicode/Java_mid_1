package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    /** Enum 클래스의 주요 메서드
    1. values(): 모든 열거형 상수를 배열로 반환
    2. valueOf(String name): 지정된 이름과 일치하는 열거형 상수를 반환
    3. name(): 열거형 상수의 이름을 문자열로 반환
    4. ordinal(): 열거형 상수의 순서를 반환 (0부터 시작)
    ※ 주의: ordinal() 메서드는 열거형 상수의 순서를 나타내지만,
    중간에 상수가 추가되거나 삭제되면 순서가 바뀔 수 있으므로
    프로그램에서 ordinal() 값을 사용하는 것은 권장되지 않음
    5. toString(): 열거형 상수의 이름을 문자열로 반환
    */
    public static void main(String[] args) {
        // 모든 열거형 상수를 배열로 얻어오기
        // grades = [BASIC, GOLD, DIAMOND]
        Grade[] grades = Grade.values();
        System.out.println("grades = " + Arrays.toString(grades));

        // 각 상수의 이름(name)과 순서(ordinal) 출력
        // name= BASIC, ordinal= 0
        // name= GOLD, ordinal= 1
        // name= DIAMOND, ordinal= 2
        for (Grade grade : grades) {
            System.out.println("name= " + grade.name() + ", ordinal= " + grade.ordinal());
        }

        // 문자열로부터 열거형 상수 얻기
        // String -> enum
        // 잘못된 문자열을 넣으면 IllegalArgumentException 예외 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
    }
}