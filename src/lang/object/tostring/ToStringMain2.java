package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        //Car: 오버라이딩 안함
        Car car = new Car("Model Y");
        //Dog: 오버라이딩 함
        Dog dog1 = new Dog("멍멍1", 3);
        Dog dog2 = new Dog("멍멍2", 4);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        //car는 오버라이딩을 안했기 때문에 object의 toString 호출되서 주소값 리턴
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        //dog는 오버라이딩을 했으므로 object가 아니라 dog에서 오버라이딩된 toString을 호출함
        //따라서 car는 주소값만, dog는 오버라이딩된 toString에서 개이름,나이 리턴으로 출력

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);
        //ObjectPrinter는 Object 타입으로 매개변수를 받고
        //Object는 모든 객체를 다 품을 수 있기에
        //car던 dog1이던 dog2던 뭐던 다 넣어버려도 가능
        //근데 car는 오버라이딩 안돼서 Object 제공한거 씀
        //dog는 오버라이딩 된거 우선이니까 그거 씀

        //그럼 dog는 오버라이딩 됐는데 Object 제공한것처럼 참조값을 확인하려면?
        //Integer.toHexString(System.identityHashCode(객체명));
        String refValue1 = Integer.toHexString(System.identityHashCode(dog1));
        String refValue2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println("dog1의 주소값: " + refValue1);
        System.out.println("dog2의 주소값: " + refValue2);
    }
}
