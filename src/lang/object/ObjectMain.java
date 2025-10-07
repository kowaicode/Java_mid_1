package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //toString(): Object 클래스의 메소드
        //해당 인스턴스의 정보제공
        String string = child.toString();
        System.out.println(string);
    }
}
