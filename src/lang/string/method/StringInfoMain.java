package lang.string.method;

public class StringInfoMain {

    public static void main(String[] args) {
        String str = "Hello, Java!"; //띄어쓰기도 문자열 카운트해줌
        System.out.println("문자열 길이: " + str.length()); //12
        System.out.println("문자열 비어있는지: " + str.isEmpty()); //false
        System.out.println("문자열 비어있거나 공백인지: " + str.isBlank()); //false
        System.out.println("문자열 비어있거나 공백인지: " + "   ".isBlank());
        //이 친구는 "   "부분을 isBlank(); 하는것임

        char c = str.charAt(7); //인덱스는 0번부터 시작
        System.out.println("7번 Index의 문자 = " + c);
    }
}
