package lang.immutable.address;

public class RefMain1_1 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스 공유 가능함
        Address a = new Address("대전");
        Address b = a;
        //b는 a를 따라감
        //즉, 하나의 대전을 나타내는 Address 인스턴스를 따라감

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //둘다 당연히 대전으로 나옴

        b.setValue("부산");
        //b를 부산으로 바꾸려고 함
        System.out.println("b를 부산으로 변경");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //이러면 둘다 부산으로 바뀌어짐...왜?
        //우선 b는 a를 참조하고 위에 쓴대로 참조형 변수는 하나의 인스턴스를 공유할 수 있음
        //근데 setValue를 통해 부산으로 바꿔버리면 같이 공유하는 인스턴스가 대전에서 부산으로 바뀌어버리는것임
        //그래서 기본형과 다르게 같은 인스턴스를 공유하는 참조형 변수 a랑 b도 값이 같이 달라지는 것
        //원래는 b만 바꾸려 했었는데 a도 바뀌어버리는 이런 경우를 사이드 이펙트라고 부름
        //주된 작업 이외에 추가적인 부수효과를 일으키는 것(부정적 의미)
        //해결법은 RefMain1_2에서...
    }
}