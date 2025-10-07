package lang.immutable.address;

public class MemberMainV1 {

    public static void main(String[] args) {
        Address address = new Address("대전");

        MemberV1 memberA = new MemberV1("회원A", address);
        MemberV1 memberB = new MemberV1("회원B", address);
        //회원 A,B의 첫 주소는 전부 대전
        //A,B 모두 인스턴스 다르고 name은 다르게 입력함
        //근데 주소는 전부 대전으로 생성된 같은 address를 참조함

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
        //당연히 건드린거 없으니까 이름 각자 다르게, 주소는 전부 대전
        //여기서 회원 B의 주소를 부산으로 변경해야함

        memberB.getAddress().setValue("부산");
        //회원 B에서 getAddress로 address를 불러옴...그러면 대전이 딸려오지만 A도 같이 참조하는 address가 옴
        //거기서 setValue를 통해 부산으로 바꿔준다면...?
        //같이 address를 참조하는 A도 바뀌어버린다!!
        System.out.println("회원B의 주소를 부산으로");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
        //그래서 b만 바꾼것처럼 보이지만 전부 부산으로 바뀜..
    }
}
