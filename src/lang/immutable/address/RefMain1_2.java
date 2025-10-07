package lang.immutable.address;

public class RefMain1_2 {

    public static void main(String[] args) {
        //사이드 이펙트 해결법: 애초에 그냥 인스턴스를 변수별로 만들어버리면 됨
        Address a = new Address("대전");
        Address b = new Address("대전");

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //둘다 당연히 대전으로 나옴

        b.setValue("부산");
        //b를 부산으로 바꾸려고 함 그러면 서로 각자 다르게 참조하니까 b만 바뀌어짐
        System.out.println("b를 부산으로 변경");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //이러면 a는 대전 고대로 가고 b만 부산으로!
        //근데....하나의 객체를 여러 변수가 공유하지 않게끔 강제할 방법이 없음...ㅠㅠ
        //객체 공유는 필요할 때도 있지만 자칫 잘못하면 사이드 이펙트 남..
    }
}
