package lang.object.poly;

public class ObjectPolyEx1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        //obj.sound();
        //obj.move();
        //컴파일 오류..Object는 sound,move 없음
        if (obj instanceof Dog dog) {
            //obj가 참조하는 객체가 dog인지 확인
            dog.sound();
            //맞으면 sound 메소드 실행
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
