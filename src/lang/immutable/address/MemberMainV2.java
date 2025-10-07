package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("대전");

        MemberV2 memberA = new MemberV2("회원1", address);
        MemberV2 memberB = new MemberV2("회원2", address);
        //회원 A,B의 첫 주소는 전부 대전

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //회원 B의 주소를 부산으로 변경해야함
        //memberB.getAddress().setValue("부산");
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("회원2의 주소를 부산으로");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}