package lang.wrapper;

public class MyIntegerNullMain1 {

    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};

        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); //없어서 null 반환
    }
    //myInteger는 객체이기 때문에 값이 없어도 null로 반환 가능함
    //But, 잘못하면 NullPointerException 예외 발생 주의
    
    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger value : intArr) {
            if (value.getValue() == target) {
                return value;
            }
        }
        return null;
    }
}
