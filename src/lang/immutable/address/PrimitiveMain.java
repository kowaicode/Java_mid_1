package lang.immutable.address;

public class PrimitiveMain {

    public static void main(String[] args) {
        //기본형 변수는 절대로 같은 값 공유 안한
        int a = 10;
        int b = a; //a의 값을 복사 후 b에 대입

        System.out.println("a = " + a); //a = 10
        System.out.println("b = " + b); //당연히 b는 a를 복사했으니까 10

        b = 20;
        System.out.println("20을 b에 대입");
        System.out.println("a = " + a); //a는 안건드렸으니까 10
        System.out.println("b = " + b); //b는 20으로 바꼈으니까 20
    }
}
