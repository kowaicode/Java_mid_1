package lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");
        //두 개의 인스턴스 생성..당연히 참조값도 두개
        System.out.println("identity(동일성) = " + (user1 == user2));
        //두 인스턴스는 참조값 다르니까 당연히 false
        System.out.println("equality(동등성) = " + (user1.equals(user2)));
        //근데 equals는 동등성을 따지는데 왜 false일까..
        //Object에서 기본으로 제공하는 equals는 동일성을 비교함
        //즉 위에 ==랑 똑같은거임...
        //그럼 동등성을 나타내려면? 오버라이딩..
    }
}
