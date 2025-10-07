package lang.object.equals;

public class EqualsMainV2 {

    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");
        //두 개의 인스턴스 생성..당연히 참조값도 두개
        //하지만 equals를 오버라이딩한 UserV2로 인스턴스 생성!
        System.out.println("identity(동일성) = " + (user1 == user2));
        //두 인스턴스는 참조값 다르니까 뭔 짓을 해도 당연히 false
        System.out.println("equality(동등성) = " + (user1.equals(user2)));
        //이번엔 오버라이딩 실시
        //이러면 UserV2 클래스 안에 있는 equals 메소드가 먼저 실행됨!
    }
}
