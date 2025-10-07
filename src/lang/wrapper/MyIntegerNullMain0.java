package lang.wrapper;

public class MyIntegerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};

        System.out.println(findValue(intArr, -1)); //찾아서 -1 리턴
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); //없어서 -1 리턴
    }
    //기본형은 이런식으로 리턴값을 무조건 넣어야하기 때문에 콘솔에 -1만 찍히면 찾은건지 없는건지 모름
    //그래서 Wrapper를 한 myInteger를 사용해보자
    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }
}
