package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스 공유 가능함
        Address a = new Address("대전");
        Address b = a;
        //b는 a를 따라감
        //즉, 하나의 대전을 나타내는 Address 인스턴스를 따라감

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //둘다 당연히 대전으로 나옴

        change(b, "부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddress) {
        System.out.println("주소값 변경: " + changeAddress);
        address.setValue(changeAddress);
    }
}
