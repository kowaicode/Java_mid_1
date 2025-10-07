package lang.object.poly;

public class ObjectPolyEx2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        //두 인스턴스는 자동적으로 object 상속
        Object object = new Object(); //Object 인스턴스 생성 가능

        Object[] objects = {dog, car, object};

        size(objects); //size 메소드 호출
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체 수: " + objects.length);
        //Object 타입을 사용했으므로 모든 객체를 다 담을 수 있어서 어디서든 다 사용 가능
    }
}
